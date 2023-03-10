package com.kritnambutt.grabcloneapi.controller;

import com.kritnambutt.grabcloneapi.entity.ShopFood;
import com.kritnambutt.grabcloneapi.model.APIResponse;
import com.kritnambutt.grabcloneapi.repository.ShopFoodRepository;
import com.kritnambutt.grabcloneapi.service.ShopFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shop_food")
public class ShopFoodController {
    @Autowired
    private ShopFoodRepository shopFoodRepository;

    @Autowired
    private ShopFoodService shopFoodService;

    @GetMapping("/last-order-food")
    public List<ShopFood> getLastOrderFood() {
        List<ShopFood> allShopFoods = shopFoodService.findAllShopFoods();
        return allShopFoods;
    }

    @GetMapping("/foodshop-may-like")
    public List<ShopFood> getFoodShopMayLike() {
        List<ShopFood> allShopFoods = shopFoodService.findAllShopFoods();
        return allShopFoods;
    }

    @GetMapping("/food-order-morning")
    public List<ShopFood> getFoodOrderMorning() {
        List<ShopFood> allShopFoods = shopFoodService.findAllShopFoods();
        return allShopFoods;
    }
}
