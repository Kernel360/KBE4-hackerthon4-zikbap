package com.hackerthon.zikbap.restaurants.dto;

import com.hackerthon.zikbap.menu.dto.MenuResponse;
import com.hackerthon.zikbap.menu.entity.Menu;
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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantBriefResponse {
  private Long restaurantId;
  private String restaurantName;
  private float rating;
  private List<Menu> primaryMenus;

}