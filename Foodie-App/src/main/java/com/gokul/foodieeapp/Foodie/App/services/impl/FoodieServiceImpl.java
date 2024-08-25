package com.gokul.foodieeapp.Foodie.App.services.impl;

import com.gokul.foodieeapp.Foodie.App.dto.OrderRequestDTO;
import com.gokul.foodieeapp.Foodie.App.dto.OrderResponseDTO;
import com.gokul.foodieeapp.Foodie.App.entities.Foodie;
import com.gokul.foodieeapp.Foodie.App.entities.OrderRequest;
import com.gokul.foodieeapp.Foodie.App.entities.Restaurant;
import com.gokul.foodieeapp.Foodie.App.entities.User;
import com.gokul.foodieeapp.Foodie.App.entities.enums.OrderStatus;
import com.gokul.foodieeapp.Foodie.App.exceptions.ResourceNotFoundException;
import com.gokul.foodieeapp.Foodie.App.exceptions.RestaurantNotFoundException;
import com.gokul.foodieeapp.Foodie.App.repositories.FoodieRepository;
import com.gokul.foodieeapp.Foodie.App.repositories.OrderRequestRepository;
import com.gokul.foodieeapp.Foodie.App.repositories.RestaurantRepository;
import com.gokul.foodieeapp.Foodie.App.repositories.UserRepository;
import com.gokul.foodieeapp.Foodie.App.services.FoodieService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
@RequiredArgsConstructor
public class FoodieServiceImpl implements FoodieService {


    private final ModelMapper modelMapper;

    private final OrderRequestRepository orderRequestRepository;

    private final RestaurantRepository restaurantRepository;

    private final UserRepository userRepository;

    @Override
    @Transactional
    public OrderResponseDTO placeOrder(OrderRequestDTO orderRequestDTO) {
        //TODO after adding spring security
        User foodie = getCurrentFoodie();
        Restaurant restaurant = restaurantRepository
                .findById(orderRequestDTO.getRestaurantId()).orElseThrow(()->
                new RestaurantNotFoundException("Restaurant with given Id " +
                        orderRequestDTO.getRestaurantId() + " not found"));
        OrderRequest orderRequest = modelMapper.map(orderRequestDTO, OrderRequest.class);
        orderRequest.setOrderStatus(OrderStatus.PENDING);
        orderRequest.setRestaurant(restaurant);
        orderRequest.setUser(foodie);
        OrderRequest savedOrderRequest = orderRequestRepository.save(orderRequest);
        // TODO Send notification to Restaurant about this request
        return modelMapper.map(savedOrderRequest, OrderResponseDTO.class);
    }

    private User getCurrentFoodie() {
        return userRepository.findById(1L).orElseThrow(
                () -> new ResourceNotFoundException("User not found with Id"+ 1));
    }
}
