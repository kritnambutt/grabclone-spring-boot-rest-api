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

    @GetMapping
    public APIResponse<List<ShopFood>> getShopFoods() {
        List<ShopFood> allShopFoods = shopFoodService.findAllShopFoods();
        return new APIResponse<>(allShopFoods.size(), allShopFoods);
    }
}
