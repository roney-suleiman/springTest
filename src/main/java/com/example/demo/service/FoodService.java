package com.example.demo.service;

import com.example.demo.domain.Food;
import com.example.demo.domain.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;


    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    public void addNewFood(String foodName){
        Food newFood = new Food(foodName);
        foodRepository.save(newFood);
    }


}
