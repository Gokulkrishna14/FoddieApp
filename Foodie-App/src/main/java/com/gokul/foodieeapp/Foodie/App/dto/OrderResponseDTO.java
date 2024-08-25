package com.gokul.foodieeapp.Foodie.App.dto;


import com.gokul.foodieeapp.Foodie.App.advices.PointDTO;
import com.gokul.foodieeapp.Foodie.App.entities.enums.OrderStatus;
import com.gokul.foodieeapp.Foodie.App.entities.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

    private Long id;

    private String orderNumber;

    private PointDTO pickupLocation;

    private PointDTO dropOffLocation;

    private LocalDateTime orderRequestedAt;

    private OrderStatus orderStatus;

    private PaymentMethod paymentMethod;

    private Double totalAmount;

}
