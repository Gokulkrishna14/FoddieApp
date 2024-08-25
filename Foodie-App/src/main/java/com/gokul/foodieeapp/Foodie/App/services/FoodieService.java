package com.gokul.foodieeapp.Foodie.App.services;

import com.gokul.foodieeapp.Foodie.App.dto.OrderRequestDTO;
import com.gokul.foodieeapp.Foodie.App.dto.OrderResponseDTO;


public interface FoodieService {


    public OrderResponseDTO placeOrder(OrderRequestDTO orderRequestDTO);
}
