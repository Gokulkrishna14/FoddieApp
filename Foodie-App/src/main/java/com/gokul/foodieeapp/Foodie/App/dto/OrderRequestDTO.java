package com.gokul.foodieeapp.Foodie.App.dto;

import com.fasterxml.jackson.databind.node.DoubleNode;
import com.gokul.foodieeapp.Foodie.App.advices.PointDTO;
import com.gokul.foodieeapp.Foodie.App.entities.enums.OrderStatus;
import com.gokul.foodieeapp.Foodie.App.entities.enums.PaymentMethod;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long restaurantId;

    private Long customerId;

    private PointDTO pickupLocation;

    private PointDTO dropOffLocation;

    private PaymentMethod paymentMethod;

    private Double totalAmount;
}
