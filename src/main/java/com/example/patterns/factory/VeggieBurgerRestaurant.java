package com.example.patterns.factory;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BurgerVeggie();
    }
}
