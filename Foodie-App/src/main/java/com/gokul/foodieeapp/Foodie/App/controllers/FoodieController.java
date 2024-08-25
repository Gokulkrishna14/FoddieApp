package com.gokul.foodieeapp.Foodie.App.controllers;

import com.gokul.foodieeapp.Foodie.App.dto.OrderRequestDTO;
import com.gokul.foodieeapp.Foodie.App.dto.OrderResponseDTO;
import com.gokul.foodieeapp.Foodie.App.services.FoodieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodie")
@RequiredArgsConstructor
public class FoodieController {

    private final FoodieService foodieService;

    @PostMapping("/placeOrder")
    public ResponseEntity<OrderResponseDTO> placeOrder(@RequestBody OrderRequestDTO orderRequestDTO){
        return ResponseEntity.ok(foodieService.placeOrder(orderRequestDTO));
    }
}
