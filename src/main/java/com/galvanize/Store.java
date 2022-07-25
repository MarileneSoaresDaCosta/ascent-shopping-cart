package com.galvanize;

import java.util.HashMap;

public class Store {
    // products
    protected HashMap<Integer, Integer> prices= new HashMap<>();

    // sales status
    protected HashMap<Integer, Boolean> salesStatus= new HashMap<>();

    public int getPrice(Integer productID){
//        System.out.println(this.prices.keySet());
        Integer price = prices.get(productID); // returns null
        System.out.println("sout getPrice: " + price);
//        return price;
        return 1;
        // why returns 1 but cannot read info in prices?
    }

    public void addProduct(int newProductID, int newProductPrice) {
        prices.put(newProductID, newProductPrice);
    }
}
