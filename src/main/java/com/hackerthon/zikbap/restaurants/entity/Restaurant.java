package com.hackerthon.zikbap.restaurants.entity;

import com.hackerthon.zikbap.menu.entity.Menu;
import jakarta.persistence.*;

import java.util.List;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "restaurants")
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;

    private String restaurantName;
    private String locationCategory;
    private String locationDetail;
    private float rating;
    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Menu> menus;

    public void updateRating(float newRestaurantRating) {
        this.rating = newRestaurantRating;
    }
}