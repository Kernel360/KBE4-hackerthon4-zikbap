package com.hackerthon.zikbap.restaurants.controller;

import com.hackerthon.zikbap.restaurants.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;

}
