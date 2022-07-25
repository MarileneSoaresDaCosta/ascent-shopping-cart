package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    private Cart cart;

    @BeforeEach
    public void setUp() {
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
        cart.addItem(201, 10, 2);
        System.out.println("totalPrice: " + cart.totalPrice());
        assertEquals(20, cart.totalPrice());
    }
//
//    @Test
//    public void printsListOfItemsInCartAndReturnsCorrectSize(){
//        // adds 3 items to cart
//        cart.addItem(201, 10);
//        cart.addItem(208, 5);
//        cart.addItem(217, 3);
//        HashMap<Integer, ArrayList<Integer>> actual = cart.getProductIds();
//        for(Integer id : actual.keySet()) {
//            System.out.println("id [q, p]: " + id + " " + actual.get(id));
//        }
//        assertEquals(3, actual.size());
//    }
//
////    @Test
////    public void returnsTotalPriceWhenAddsOneItemToCartWithItems(){
////        // adds 3 items to cart
////        cart.addItem(201, 10);
////        cart.addItem(208, 5);
////        cart.addItem(217, 3);
////        System.out.println(cart.get());
////        System.out.println("totalPrice: " + cart.totalPrice());
////        assertEquals(119, cart.totalPrice());
////    }
}
