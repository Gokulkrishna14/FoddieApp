package com.gokul.foodieeapp.Foodie.App.repositories;

import com.gokul.foodieeapp.Foodie.App.entities.Foodie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodieRepository extends JpaRepository<Foodie, Long> {
}
