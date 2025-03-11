package com.hackerthon.zikbap.review.service;

import com.hackerthon.zikbap.global.dto.BaseResponseDTO;
import com.hackerthon.zikbap.global.dto.PageRequestDTO;
import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import com.hackerthon.zikbap.restaurants.repository.RestaurantRepository;
import com.hackerthon.zikbap.review.dto.ReviewListResponseDTO;
import com.hackerthon.zikbap.review.dto.ReviewRequestDTO;
import com.hackerthon.zikbap.review.dto.ReviewResponseDTO;
import com.hackerthon.zikbap.review.entity.Review;
import com.hackerthon.zikbap.review.repository.ReviewRepository;
import com.hackerthon.zikbap.user.entity.User;
import com.hackerthon.zikbap.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final RestaurantRepository restaurantRepository;
    private final UserRepository userRepository;

    public ReviewListResponseDTO getReviews(Long restaurantId, PageRequestDTO pageRequestDTO, Long userId) {
        Page<Review> reviewPage = reviewRepository.findByRestaurantIdAndDeletedFalse(restaurantId, pageRequestDTO.toPageable());

        List<ReviewResponseDTO> reviews = reviewPage.getContent()
                .stream()
                .map((review) -> new ReviewResponseDTO(review, userId))
                .collect(Collectors.toList());
        return new ReviewListResponseDTO(reviews, reviewPage.hasNext());
    }

    @Transactional
    public BaseResponseDTO createReview(ReviewRequestDTO requestDTO, Long restaurantId, Long userId) {
        Restaurant foundedRestaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant Not Found"));
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User Not Found"));

        Review newReview = Review.createNewReview(requestDTO.getContent(), user, foundedRestaurant, requestDTO.getRating(), LocalDateTime.now());
        reviewRepository.save(newReview);
        float newRestaurantRating = reviewRepository.getRestaurantRatingAverageByRestaurantIdAndDeletedFalse(foundedRestaurant.getRestaurantId());
        foundedRestaurant.updateRating(newRestaurantRating);
        return new BaseResponseDTO("리뷰 작성 성공", HttpStatus.CREATED.value());
    }

    @Transactional
    public BaseResponseDTO modifyReview(ReviewRequestDTO requestDTO, Long reviewId, Long userId) {
        Review foundedReview = reviewRepository.findById(reviewId).orElseThrow(() -> new RuntimeException("Review Not Found"));

        if (!foundedReview.getUser().getUserId().equals(userId)) {
            throw new RuntimeException("Access denied");
        }

        Restaurant foundedRestaurant = restaurantRepository.findById(foundedReview.getReviewId()).orElseThrow(() -> new RuntimeException("Restaurant Not Found"));
        foundedReview.updateReview(requestDTO.getContent(), requestDTO.getRating(), LocalDateTime.now());
        float newRestaurantRating = reviewRepository.getRestaurantRatingAverageByRestaurantIdAndDeletedFalse(foundedRestaurant.getRestaurantId());
        foundedRestaurant.updateRating(newRestaurantRating);

        return new BaseResponseDTO("리뷰 수정 성공", HttpStatus.OK.value());
    }

    @Transactional
    public BaseResponseDTO deleteReview(Long reviewId, Long userId) {
        Review foundedReview = reviewRepository.findById(reviewId).orElseThrow(() -> new RuntimeException("Review Not Found"));
        if (!foundedReview.getUser().getUserId().equals(userId)) {
            throw new RuntimeException("Access denied");
        }
        foundedReview.deleteReview(LocalDateTime.now());
        Restaurant restaurant = foundedReview.getRestaurant();
        float newRestaurantRating = reviewRepository.getRestaurantRatingAverageByRestaurantIdAndDeletedFalse(restaurant.getRestaurantId());
        restaurant.updateRating(newRestaurantRating);
        return new BaseResponseDTO("리뷰 삭제 성공", HttpStatus.OK.value());
    }
}