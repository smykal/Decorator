package com.starbunio.basic;

public class Espresso extends Drink {
    public Espresso(){
        description = "zajebiste espresso";
    }

    @Override
    public double price() {
        return 1.89;
    }
}
