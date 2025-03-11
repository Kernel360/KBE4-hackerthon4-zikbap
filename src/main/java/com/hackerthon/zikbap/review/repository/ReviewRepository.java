package com.hackerthon.zikbap.review.repository;

import com.hackerthon.zikbap.review.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    @Query("SELECT r FROM Review r WHERE r.restaurant.restaurantId = :restaurantId AND r.deleted = false")
    Page<Review> findByRestaurantIdAndDeletedFalse(Long restaurantId, Pageable pageable);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.restaurant.restaurantId = :restaurantId And r.deleted = false")
    float getRestaurantRatingAverageByRestaurantIdAndDeletedFalse(Long restaurantId);
}
