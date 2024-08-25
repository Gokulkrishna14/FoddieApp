package com.gokul.foodieeapp.Foodie.App.repositories;

import com.gokul.foodieeapp.Foodie.App.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
