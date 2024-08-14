package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddingBagels() {
        Basket basket = new Basket();
        basket.addToBasket("plain", 1);
        Assertions.assertEquals(1, basket.getBasket().size());
    }
}
