package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        cart.addItem(201, 10, 2, false);
        System.out.println("totalPrice: " + cart.totalPrice());
        assertEquals(20, cart.totalPrice());
    }
/*
Given I have an empty cart, when I add more than one of an item,
 then I expect itemQuantities() to show the number of items
  I have added.
 */
    @Test
    public void returnsThreeWhen3ItemsWereAdded(){
        cart.addItem(201, 10, 2, false);
        cart.addItem(208, 5, 12, false);
        cart.addItem(217, 2, 20, false);

        assertEquals(17, cart.itemQuantities());
    }
    /*
    Given I have an empty cart, when I add items,
    then I expect itemizedList() reflect the items
    I have added along with their price and quantity.
     */
    @Test
    public void returnsItemsListWhenCartHasItems(){
        cart.addItem(201, 10, 2, false);
        cart.addItem(208, 5, 12, false);
        cart.addItem(217, 2, 20, false);

        // check size
        assertEquals(3, cart.itemizedList().size());

        // check contents - one example
        Item itemOfPrice12 = cart.itemizedList().get(5);
        assertEquals(12, itemOfPrice12.getPrice());
        }

    /*
    Given I have an empty cart, when I add more than one of an item,
    then I expect totalPrice() to reflect both the item price and quantity.
     */
    @Test
    public void returnsTotalPriceWhenAddsOneItemToCartWithItems(){
        cart.addItem(201, 10, 2, false);
        cart.addItem(208, 5, 12, false);
        cart.addItem(217, 2, 20, false);
        assertEquals(120, cart.totalPrice());
    }
    /*
    Given I have a cart with items that are not on sale,
    when I add items that are on sale,
    I expect onSaleItems() to include only the items on sale.
    */
    @Test
    public void onSaleItemsReturnsOnlyItemsOnSale(){
        cart.addItem(201, 10, 2, true);
        cart.addItem(208, 5, 12, false);
        cart.addItem(217, 2, 20, true);

        assertEquals(2, cart.onSaleItems().size());
    }


}
