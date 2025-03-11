package com.hackerthon.zikbap.restaurants.service;

import com.hackerthon.zikbap.restaurants.dto.RestaurantResponse;
import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import com.hackerthon.zikbap.restaurants.repository.RestaurantRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestaurantService {
  private final RestaurantRepository restaurantRepository;

  public List<RestaurantResponse> getRestaurantsSortedByHighestRating(String region) {
       List<Restaurant> listRestaurant = restaurantRepository.findAllByOrderByRatingDesc(region);
       // Entity -> DTO
    return listRestaurant.stream().map(RestaurantResponse::new).collect(Collectors.toList());
  }

  public Optional<RestaurantResponse> findRestaurantById(Long restaurantId) {
    return restaurantRepository.findRestaurantByRestaurantId(restaurantId).map(RestaurantResponse::new);
  }

  public List<RestaurantResponse> getRestaurantsSortedByLowestPrice(String region) {
    List<Restaurant> listRestaurant = restaurantRepository.findAllByOrderByPrice(region);

    return listRestaurant.stream().map(RestaurantResponse::new).collect(Collectors.toList());
  }
  }