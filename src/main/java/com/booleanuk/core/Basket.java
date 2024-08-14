package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<String> bagels;
    final String[] allowedTypes;

    public Basket() {
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
    }

    public void addToBasket(String bagelType, int amount) {
        if (!Arrays.asList(allowedTypes).contains(bagelType)) return;
        for (int i = 0; i < amount; i++) {
            bagels.add(bagelType);
        }
    }

    public ArrayList<String> getBasket() {
        return bagels;
    }
}
