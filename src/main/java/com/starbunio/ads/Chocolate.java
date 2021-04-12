package com.starbunio.ads;

import com.starbunio.basic.Drink;

public class Chocolate extends DrinkDecorator {
    Drink drink;
    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " chocolaaaalate ";
    }

    @Override
    public double price() {
        return drink.price() + 0.69;
    }
}
