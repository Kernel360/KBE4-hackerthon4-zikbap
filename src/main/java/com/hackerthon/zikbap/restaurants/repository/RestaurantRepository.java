package com.hackerthon.zikbap.restaurants.repository;

import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
  @Query("select r from Restaurant r where r.locationCategory =:locationCategory order by r.rating DESC ")
  List<Restaurant> findAllByOrderByRatingDesc(String locationCategory);

  @Query("SELECT r from Restaurant r join Menu m on r.restaurantId = m.restaurant.restaurantId where m.signature = 1 and r.locationCategory =:locationCategory order by m.price asc")
  List<Restaurant> findAllByOrderByPrice(String locationCategory);


  Optional<Restaurant> findRestaurantByRestaurantId(Long restaurantId);
}