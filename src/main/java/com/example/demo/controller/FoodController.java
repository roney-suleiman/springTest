package com.example.demo.controller;

import com.example.demo.domain.Food;
import com.example.demo.service.FoodService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;


    @GetMapping
    public List<Food> allFoods(){
        return foodService.getAllFoods();
    }

    @GetMapping("addFood")
    public void addFood(@RequestParam String foodName){
        foodService.addNewFood(foodName);
    }

}
