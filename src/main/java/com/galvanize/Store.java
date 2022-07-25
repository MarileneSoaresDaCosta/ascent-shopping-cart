package com.galvanize;

import java.util.HashMap;

public class Store {
    // products
    protected HashMap<Integer, Integer> prices= new HashMap<>();

    // sales status
    protected HashMap<Integer, Boolean> salesStatus= new HashMap<>();

    public int getPrice(int productID){
        return 2;
    }
}
