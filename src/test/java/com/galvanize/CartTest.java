package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    private Cart cart;

    @BeforeEach
    public void setUp(){
        this.cart = new Cart();
    }
    
    /*
     Given that I visit the site, when I begin
     shopping, then I expect my cart to be empty.
     */

    @Test
    public void cartExistsAndIsEmpty(){
        assertEquals(true, cart.isEmpty());
    }
/*
    Given I have an empty cart, when I add an Item,
     then I expect to see totalPrice reflect the
     sum of all the Items in my cart,
     times the quantities of each item.
 */
    @Test
    public void returnsTotalPriceZeroWhenCartIsEmpty(){
        assertEquals(0, cart.totalPrice());
    }

    @Test
    public void returnsTotalPriceWhenAddsOneItemToEmptyCart(){
        cart.addItem(201, 10);
        System.out.println("totalPrice: " + cart.totalPrice());
        assertEquals(20, cart.totalPrice());
    }

    @Test
    public void returnsTotalPriceWhenAddsOneItemToCartWithItems(){

        cart.addItem(201, 10);
        System.out.println("totalPrice: " + cart.totalPrice());
        assertEquals(20, cart.totalPrice());
    }
}
