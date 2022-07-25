package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    private Cart cart;


    @BeforeEach
    public void setUp(){
        this.cart = new Cart();
        Store newStore = new Store();
        for (int i = 0; i < 20 ; i++) {
            int newProductID = 200 + i;
            int newProductPrice = 1 + i;
            newStore.addProduct(newProductID, newProductPrice);
        }
        // print storage
        System.out.println(("Adding products to Store"));
        for(int id : newStore.prices.keySet()) {
            int price = newStore.prices.get(id);
            System.out.println("id: " + id + " price: " + price);
        }
        System.out.println("store is ready ===========");
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
    public void printsListOfItemsInCartAndReturnsCorrectSize(){
        // adds 3 items to cart
        cart.addItem(201, 10);
        cart.addItem(208, 5);
        cart.addItem(217, 3);
        Set<Integer> actual = cart.getProductIds();
        for(int id : actual) {
            System.out.println("id: " + id);
        }
        assertEquals(3, actual.size());
    }

//    @Test
//    public void returnsTotalPriceWhenAddsOneItemToCartWithItems(){
//        // adds 3 items to cart
//        cart.addItem(201, 10);
//        cart.addItem(208, 5);
//        cart.addItem(217, 3);
//        System.out.println(cart.get());
//        System.out.println("totalPrice: " + cart.totalPrice());
//        assertEquals(119, cart.totalPrice());
//    }
}
