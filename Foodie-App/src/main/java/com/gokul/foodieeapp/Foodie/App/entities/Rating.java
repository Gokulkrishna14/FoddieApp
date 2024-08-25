package com.gokul.foodieeapp.Foodie.App.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private FoodOrder foodOrder;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToOne
    private Driver rider;

    private Integer riderRating;

    private Integer restaurantRating;
}
