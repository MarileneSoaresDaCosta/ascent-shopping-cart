package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    private Store newStore;
    @BeforeEach
    public void setUp() {
        this.newStore = new Store();
    }
    /*
    1.Add a Store class and an Inventory class.
    2.A store will have an Inventory
     */
    @Test
    public void storeHasInventory(){
        // a Store has an Inventory
        assertEquals(true, newStore.getInventory() != null);
    }
    /*
    3.A store should be able to return the whole inventory
     */
    @Test
    public void storeCanGetFullInventory(){
        // populate a new inventory
        newStore.getInventory().addItem(201, 10, 2, false);
        assertEquals(1, newStore.getInventory().getStorage().size());
    }
    /*
    4.A store should be able to restock an item (increase the number of that item available)
     */
    @Test
    public void restockItemUpdatesStorage(){
        // check if we have right number
        newStore.getInventory().addItem(201, 10, 2, false);
        assertEquals(10, newStore.getInventory().getItemQuantity(201));
        // restock
        newStore.getInventory().update(201, 5);
        assertEquals(15, newStore.getInventory().getItemQuantity(201));
    }
    /*
    When items are added to a cart, they are subtracted from inventory
     */
//    @Test
//    public void inventoryQuantityIsUpdatedWhenItemIsAddedToCart(){
//        // check if we have right quantity in storage
//        newStore.getInventory().addItem(201, 10, 2, false);
//        assertEquals(10, newStore.getInventory().getItemQuantity(201));
//        // add to cart - sell that q
//        Cart newCart = new Cart();
//        newCart.addItem(201, 3, 2, false);
//        assertEquals(7, newStore.getInventory().getItemQuantity(201));
//    }


}
