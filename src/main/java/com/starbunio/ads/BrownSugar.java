package com.starbunio.ads;

import com.starbunio.basic.Drink;

public class BrownSugar extends DrinkDecorator {
    Drink drink;
    public BrownSugar(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " brown Sugar ";
    }

    @Override
    public double price() {
        return drink.price() + 1.09;
    }
}