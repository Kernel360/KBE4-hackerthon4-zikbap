package com.hackerthon.zikbap.restaurants.repository;

import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
