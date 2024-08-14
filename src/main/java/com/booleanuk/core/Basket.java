package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<String> bagels;
    final String[] allowedTypes;
    int basketSize;

    public Basket() {
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
        basketSize = 10; // Default value
    }

    public Basket(int basketSize) {
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
        this.basketSize = basketSize;
    }

    public void addToBasket(String bagelType, int amount) {
        if (!Arrays.asList(allowedTypes).contains(bagelType) || bagels.size() + amount > basketSize) return;
        for (int i = 0; i < amount; i++) {
            bagels.add(bagelType);
        }
    }

    public ArrayList<String> getBasket() {
        return bagels;
    }

    public boolean order() {
        System.out.printf("Order of %d bagels sent", bagels.size());
        bagels = new ArrayList<>();
        return true;
    }
}
