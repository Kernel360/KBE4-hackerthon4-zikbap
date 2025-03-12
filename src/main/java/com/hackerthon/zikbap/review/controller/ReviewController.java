package com.hackerthon.zikbap.review.controller;

import com.hackerthon.zikbap.global.argumentresolver.LoginUser;
import com.hackerthon.zikbap.global.dto.BaseResponseDTO;
import com.hackerthon.zikbap.global.dto.PageRequestDTO;
import com.hackerthon.zikbap.review.dto.ReviewListResponseDTO;
import com.hackerthon.zikbap.review.dto.ReviewRequestDTO;
import com.hackerthon.zikbap.review.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "*", maxAge = 3600, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
allowedHeaders = "*", allowCredentials = "true")
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/api/reviews/{restaurantId}")
    public ResponseEntity<ReviewListResponseDTO> getReviews(@PathVariable  Long restaurantId, @ModelAttribute PageRequestDTO pageRequest,
                                                            @LoginUser String email) {
        log.info("userEmail : {}", email);
        ReviewListResponseDTO response = reviewService.getReviews(restaurantId, pageRequest, email);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/api/reviews/{restaurantId}")
    public ResponseEntity<BaseResponseDTO> createReview(@PathVariable Long restaurantId, @RequestBody ReviewRequestDTO requestDTO,
                                                        @LoginUser String userEmail) {
        BaseResponseDTO response = reviewService.createReview(requestDTO, restaurantId, userEmail);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/api/reviews/{reviewId}")
    public ResponseEntity<BaseResponseDTO> updateReview(@PathVariable Long reviewId, @RequestBody ReviewRequestDTO requestDTO,
                                                        @LoginUser String userEmail) {
        BaseResponseDTO response = reviewService.modifyReview(requestDTO, reviewId, userEmail);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/api/reviews/{reviewId}")
    public ResponseEntity<BaseResponseDTO> deleteReview(@PathVariable Long reviewId, @LoginUser String userEmail) {
        BaseResponseDTO response = reviewService.deleteReview(reviewId, userEmail);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
