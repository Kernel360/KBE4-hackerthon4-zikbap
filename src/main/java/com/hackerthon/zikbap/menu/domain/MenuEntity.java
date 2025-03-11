package com.hackerthon.zikbap.menu.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "menus")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class MenuEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long menu_id;

  @Column(nullable = false, length = 8)
  private String name;

  @Column(nullable = false)
  private int price;

  @Column(length = 32)
  private String description;

  @Column(length = 128)
  private String image_url;

  @Column(nullable = false)
  private int signature;

//  @ManyToOne
//  @JoinColumn(name = "restaurant_id")
//  private Restaurant restaurant;

}