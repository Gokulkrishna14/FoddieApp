package com.gokul.foodieeapp.Foodie.App.repositories;

import com.gokul.foodieeapp.Foodie.App.entities.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRequestRepository extends JpaRepository<OrderRequest, Long> {
}
