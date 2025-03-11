package com.hackerthon.zikbap.menu.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
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
  private Long menuId;

  @Column(nullable = false, length = 8)
  private String name;

  @Column(nullable = false)
  private int price;

  @Column(length = 32)
  private String description;

  @Column(length = 128)
  private String imageUrl;

  @Column(nullable = false)
  private int signature;

  @Column(name = "created_at", updatable = false)
  private LocalDateTime createdAt;

  @Column(name = "modified_at")
  private LocalDateTime modifiedAt;

  @Column(name = "deleted_at")
  private LocalDateTime deletedAt;

  @Column(nullable = false)
  private int deleted;

//  @ManyToOne
//  @JoinColumn(name = "restaurant_id")
//  private Restaurant restaurant;

}