package com.kritnambutt.grabcloneapi.repository;

import com.kritnambutt.grabcloneapi.entity.ShopFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//public interface ShopFoodRepository extends JpaRepository<ShopFood, Long> {
public interface ShopFoodRepository extends JpaRepository<ShopFood, Long> {
    Optional<ShopFood> findById(int id);
    Optional<ShopFood> findByName(String name);
}
