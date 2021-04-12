package com.starbunio.ads;

import com.starbunio.basic.Drink;

public class BlueberryJuice extends DrinkDecorator {
    Drink drink;
    public BlueberryJuice(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " blueberry juice ";
    }

    @Override
    public double price() {
        return drink.price() + 0.39;
    }
}