package com.kritnambutt.grabcloneapi.service;

import com.kritnambutt.grabcloneapi.entity.ShopFood;
import com.kritnambutt.grabcloneapi.repository.ShopFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopFoodService {
    @Autowired
    private ShopFoodRepository shopFoodRepository;

    public List<ShopFood> findAllShopFoods() {
        List<ShopFood> result = new ArrayList<>();
        shopFoodRepository.findAll().forEach(result::add);
        return result;
    }
}
