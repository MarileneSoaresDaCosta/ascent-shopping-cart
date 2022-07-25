package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void foo(){
        // a Store has an Inventory
        Store newStore = new Store();
        assertEquals(true, newStore.getInventory() != null);
    }


}
