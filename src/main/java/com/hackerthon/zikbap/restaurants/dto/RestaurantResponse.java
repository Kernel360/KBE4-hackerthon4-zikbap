package com.hackerthon.zikbap.restaurants.dto;

import com.hackerthon.zikbap.menu.dto.MenuResponse;
import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class RestaurantResponse {
  private Long restaurantId;
  private String restaurantName;
  private String locationCategory;
  private String locationDetail;
  private float rating;
  private String phoneNumber;
  private String categoryId;
  private List<MenuResponse> menus;

  public RestaurantResponse(Restaurant restaurant) {
    this.restaurantId = restaurant.getRestaurantId();
    this.restaurantName = restaurant.getRestaurantName();
    this.locationCategory = restaurant.getLocationCategory();
    this.locationDetail = restaurant.getLocationDetail();
    this.rating = restaurant.getRating();
    this.phoneNumber = restaurant.getPhoneNumber();
    this.menus = restaurant.getMenus().stream().map(MenuResponse::new).collect(Collectors.toList());
    this.categoryId = restaurant.getCategoryId();
  }

  }