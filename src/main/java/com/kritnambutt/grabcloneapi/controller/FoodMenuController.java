package com.kritnambutt.grabcloneapi.controller;

import com.kritnambutt.grabcloneapi.entity.FoodMenu;
import com.kritnambutt.grabcloneapi.repository.FoodMenuRepository;
import com.kritnambutt.grabcloneapi.service.FoodMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/food_menu")
public class FoodMenuController {
    @Autowired
    private FoodMenuRepository foodMenuRepository;

    @Autowired
    private FoodMenuService foodMenuService;

    @GetMapping("/match-for-you")
    public List<FoodMenu> getFoodMenusMatchForYou() {
        List<FoodMenu> allFoodMenus = foodMenuService.findAllFoodMenus();
        return allFoodMenus;
    }

}
