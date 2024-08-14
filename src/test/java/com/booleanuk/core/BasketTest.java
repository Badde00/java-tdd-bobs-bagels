package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BasketTest {
    @Test
    public void testAddingBagels() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 1);
        Assertions.assertEquals(1, basket.getBasket().size());
    }

    @Test
    public void testAddingUnavailableType() {
        Basket basket = new Basket();
        basket.addToBasket("plain", 1);
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testAdding0Bagels() {
        Basket basket = new Basket();
        basket.addToBasket("everything", 0);
        Assertions.assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void testAddingTooManyBagels() {
        Basket basket = new Basket(20);
        basket.addToBasket("everything", 20);
        Assertions.assertEquals(20, basket.getBasket().size());
        basket.addToBasket("everything", 1);
        Assertions.assertEquals(20, basket.getBasket().size());
    }

    @Test
    public void testOrder() {
        Basket basket = new Basket(20);
        basket.addToBasket("everything", 20);
        Assertions.assertTrue(basket.order());
        Assertions.assertEquals(0, basket.getBasket().size());
    }
}
