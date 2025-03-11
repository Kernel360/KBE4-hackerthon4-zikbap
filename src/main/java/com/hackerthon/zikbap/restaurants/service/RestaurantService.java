package com.hackerthon.zikbap.restaurants.service;

import com.hackerthon.zikbap.restaurants.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;


}
