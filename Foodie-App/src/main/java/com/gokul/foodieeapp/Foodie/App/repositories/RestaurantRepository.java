package com.gokul.foodieeapp.Foodie.App.repositories;

import com.gokul.foodieeapp.Foodie.App.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
