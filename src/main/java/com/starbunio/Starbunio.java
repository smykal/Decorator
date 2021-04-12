package com.starbunio;

import com.starbunio.ads.BrownSugar;
import com.starbunio.basic.*;

public class Starbunio {
    public static void main(String[] args) {
        Drink drink = new Espresso();
        System.out.println(drink.getDescription() + "  " + drink.price());

        Drink drink1 = new Jagerbomba();
        drink1 = new Martini(drink1);
        drink1 = new BrownSugar(drink1);
        System.out.println(drink1.getDescription() + "  " + drink1.price());

        Drink drink2 = new Mochito();
        drink2 = new BrownSugar(drink2);
        drink2 = new BrownSugar(drink2);
        System.out.println(drink2.getDescription() + "  " + drink2.price());
    }

}
