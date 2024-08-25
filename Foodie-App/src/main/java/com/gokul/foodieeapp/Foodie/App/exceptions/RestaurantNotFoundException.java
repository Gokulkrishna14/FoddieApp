package com.gokul.foodieeapp.Foodie.App.exceptions;

public class RestaurantNotFoundException extends RuntimeException{
    public RestaurantNotFoundException() {
    }

    public RestaurantNotFoundException(String message) {
        super(message);
    }
}
