package com.starbunio.basic;

public class Mochito extends Drink {
    public Mochito() {
        description = "Mochito z lodem";
    }
    @Override
    public double price() {
        return 0.99;
    }
}
