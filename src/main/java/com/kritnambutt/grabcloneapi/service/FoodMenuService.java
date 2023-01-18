package com.kritnambutt.grabcloneapi.service;

import com.kritnambutt.grabcloneapi.entity.FoodMenu;
import com.kritnambutt.grabcloneapi.repository.FoodMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodMenuService {
    @Autowired
    private FoodMenuRepository foodMenuRepository;

    public List<FoodMenu> findAllFoodMenus() {
        List<FoodMenu> result = new ArrayList<>();
        foodMenuRepository.findAll().forEach(result::add);
        return result;
    }
}
