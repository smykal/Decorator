package com.starbunio.basic;

public class Martini extends Drink {
    public Martini(Drink drink1) {
        description = "Martini ";
    }

    @Override
    public double price() {
        return 1.79;
    }
}
