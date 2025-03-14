package com.hackerthon.zikbap.restaurants.controller;

import com.hackerthon.zikbap.restaurants.dto.RestaurantResponse;
import com.hackerthon.zikbap.restaurants.entity.Restaurant;
import com.hackerthon.zikbap.restaurants.service.RestaurantService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RestaurantController {

    private final RestaurantService restaurantService;


    // queryParam = region & sort
    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantResponse>> getRestaurantListWithSort(@RequestParam String region,
        @RequestParam(defaultValue = "RATING") String sort) {
        // sortBy -> 가격 순(PRICE), 별점 순(RATING)
        if (sort.equals("RATING"))
            return ResponseEntity.ok(restaurantService.getRestaurantsSortedByHighestRating(region));
        if (sort.equals("PRICING"))
            return ResponseEntity.ok(restaurantService.getRestaurantsSortedByLowestPrice(region));
        return null;
    }

    // 상세조회
    @GetMapping("/restaurants/{restaurantId}")
    public ResponseEntity<Optional<RestaurantResponse>> getRestaurantById(
        @PathVariable Long restaurantId) {
        Optional<RestaurantResponse> restaurant = restaurantService.findRestaurantById(restaurantId);
        return ResponseEntity.ok(restaurant);
    }
}