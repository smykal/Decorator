package com.starbunio.basic;

public abstract class Drink {
    public String description = "some drink";

    public String getDescription() {
        return description;
    }

    public abstract double price();
}
