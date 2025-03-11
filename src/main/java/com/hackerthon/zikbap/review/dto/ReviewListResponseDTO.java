package com.hackerthon.zikbap.review.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class ReviewListResponseDTO {
    private List<ReviewResponseDTO> reviews;
    private boolean hasNextPage;

    public ReviewListResponseDTO(List<ReviewResponseDTO> reviews, boolean hasNextPage) {
        this.reviews = reviews;
        this.hasNextPage = hasNextPage;
    }
}
