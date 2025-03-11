package com.hackerthon.zikbap.menu.repository;

import com.hackerthon.zikbap.menu.domain.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {

}