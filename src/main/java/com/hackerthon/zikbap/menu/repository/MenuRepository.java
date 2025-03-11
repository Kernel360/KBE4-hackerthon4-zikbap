package com.hackerthon.zikbap.menu.repository;

import com.hackerthon.zikbap.menu.entity.Menu;
import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
  List<Menu> findByRestaurantOrderByPriceAsc(Restaurant restaurant);
}