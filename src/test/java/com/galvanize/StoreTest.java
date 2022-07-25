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

}
