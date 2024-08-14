package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> bagels;

    public Basket() {
        bagels = new ArrayList<>();
    }

    public void addToBasket(String bagelType, int amount) {
        for (int i = 0; i < amount; i++) {
            bagels.add(bagelType);
        }
    }

    public ArrayList<String> getBasket() {
        return bagels;
    }
}
