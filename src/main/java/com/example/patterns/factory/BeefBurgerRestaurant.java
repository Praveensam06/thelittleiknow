package com.example.patterns.factory;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BurgerBeef();
    }
}
