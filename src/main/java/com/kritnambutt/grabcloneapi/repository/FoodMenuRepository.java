package com.kritnambutt.grabcloneapi.repository;

import com.kritnambutt.grabcloneapi.entity.FoodMenu;
import com.kritnambutt.grabcloneapi.entity.ShopFood;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodMenuRepository extends JpaRepository<FoodMenu, Long> {
    Optional<ShopFood> findById(int id);
    Optional<ShopFood> findByName(String name);
}
