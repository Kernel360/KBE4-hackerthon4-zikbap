package com.hackerthon.zikbap.review.dto;

import com.hackerthon.zikbap.review.entity.Review;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReviewResponseDTO {
    private Long reviewId;
    private String nickname;
    private LocalDateTime createdAt;
    private String gender;
    private float rating;
    private String content;
    private boolean canEditOrDelete;

    public ReviewResponseDTO(Review review, String userEmail) {
        this.reviewId = review.getReviewId();
        this.nickname = review.getUser().getNickname();
        this.createdAt = review.getCreatedAt();
        this.gender = review.getUser().getGender().toString();
        this.rating = review.getRating();
        this.content = review.getContent();
        this.canEditOrDelete = review.getUser().getEmail().equals(userEmail);
    }
}