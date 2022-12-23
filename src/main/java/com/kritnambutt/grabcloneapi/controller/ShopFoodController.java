package com.kritnambutt.grabcloneapi.controller;

import com.kritnambutt.grabcloneapi.entity.ShopFood;
import com.kritnambutt.grabcloneapi.repository.ShopFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/shop_food")
public class ShopFoodController {
    private ShopFoodRepository shopFoodRepository;

    @Autowired
    public ShopFoodController(ShopFoodRepository shopFoodRepository) {
        this.shopFoodRepository = shopFoodRepository;
    }

    @GetMapping
    public List<ShopFood> getShopFoods() {
        List<ShopFood> result = new ArrayList<>();
        shopFoodRepository.findAll().forEach(result::add);
        return result;
    }
}
