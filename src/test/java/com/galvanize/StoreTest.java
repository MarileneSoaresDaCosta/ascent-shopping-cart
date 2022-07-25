package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    @Test
    public void generateStorageAndRetrieveOneItem(){
        Store newStore = new Store();
        for (int i = 0; i < 20 ; i++) {
            int newProductID = 200 + i;
            int newProductPrice = 1 + i;
            newStore.addProduct(newProductID, newProductPrice);
        }
        // printing
//        for(int id : newStore.prices.keySet()) {
//            int price = newStore.prices.get(id);
//            System.out.println("id: " + id + " price: " + price);
//        }

        // check if price of 1st item is correct
        System.out.println("price for item 201 is: " + newStore.prices.get(201));
        assertEquals(2, newStore.prices.get(201));



    }
}
