package com.hackerthon.zikbap.review.controller;

import com.hackerthon.zikbap.global.dto.BaseResponseDTO;
import com.hackerthon.zikbap.global.dto.PageRequestDTO;
import com.hackerthon.zikbap.review.dto.ReviewListResponseDTO;
import com.hackerthon.zikbap.review.dto.ReviewRequestDTO;
import com.hackerthon.zikbap.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/api/reviews/{restaurantId}")
    public ResponseEntity<ReviewListResponseDTO> getReviews(@PathVariable  Long restaurantId, @ModelAttribute PageRequestDTO pageRequest) {
        ReviewListResponseDTO response = reviewService.getReviews(restaurantId, pageRequest, 1L);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/api/reviews/{restaurantId}")
    public ResponseEntity<BaseResponseDTO> createReview(@PathVariable Long restaurantId, @RequestBody ReviewRequestDTO requestDTO, Long userId) {
        BaseResponseDTO response = reviewService.createReview(requestDTO, restaurantId, 1L);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/api/reviews/{reviewId}")
    public ResponseEntity<BaseResponseDTO> updateReview(@PathVariable Long reviewId, @RequestBody ReviewRequestDTO requestDTO, Long userId) {
        BaseResponseDTO response = reviewService.modifyReview(requestDTO, reviewId, 1L);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/api/reviews/{reviewId}")
    public ResponseEntity<BaseResponseDTO> deleteReview(@PathVariable Long reviewId, Long userId) {
        BaseResponseDTO response = reviewService.deleteReview(reviewId, 1L);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
