package com.hackerthon.zikbap.menu.dto;

import com.hackerthon.zikbap.menu.entity.Menu;
import jakarta.persistence.Column;
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
public class MenuResponse {
  private Long menuId;
  private String name;
  private int price;
  private String description;
  private String imageUrl;
  private int signature;

  public MenuResponse (Menu menu) {
    this.menuId = menu.getMenuId();
    this.name = menu.getName();
    this.price = menu.getPrice();
    this.description = menu.getDescription();
    this.imageUrl = menu.getImageUrl();
    this.signature = menu.getSignature();
  }

}