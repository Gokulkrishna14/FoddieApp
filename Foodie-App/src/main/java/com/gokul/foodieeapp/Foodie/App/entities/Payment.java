package com.gokul.foodieeapp.Foodie.App.entities;

import com.gokul.foodieeapp.Foodie.App.entities.enums.PaymentMethod;
import com.gokul.foodieeapp.Foodie.App.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private FoodOrder foodOrder;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private Double amount;

    private Double partialPaymentAmount;

    @CreationTimestamp
    private LocalDateTime paymentTime;

    private String otp;

    private Boolean preAuthorized;
}
