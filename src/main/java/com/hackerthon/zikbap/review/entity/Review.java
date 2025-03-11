package com.hackerthon.zikbap.review.entity;

import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import com.hackerthon.zikbap.user.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "reviews")
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    private float rating;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private LocalDateTime deletedAt;
    private boolean deleted;

    @Builder
    private Review(String content, User user, Restaurant restaurant, float rating, LocalDateTime createdAt, LocalDateTime modifiedAt, LocalDateTime deletedAt, boolean deleted) {
        this.content = content;
        this.user = user;
        this.restaurant = restaurant;
        this.rating = rating;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.deletedAt = deletedAt;
        this.deleted = deleted;
    }

    public static Review createNewReview(String content, User user, Restaurant restaurant, float rating, LocalDateTime createdAt) {
        return Review.builder()
                .content(content)
                .createdAt(createdAt)
                .restaurant(restaurant)
                .rating(rating)
                .deletedAt(null)
                .modifiedAt(null)
                .user(user)
                .deleted(false)
                .build();
    }

    public void updateReview(String content, float rating, LocalDateTime modifiedAt) {
        this.content = content;
        this.rating =  rating;
        this.modifiedAt = modifiedAt;
    }

    public void deleteReview(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
        this.deleted = true;
    }
}
