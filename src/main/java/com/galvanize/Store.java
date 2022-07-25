package com.galvanize;

import java.util.HashMap;

public class Store {
    // products
    protected HashMap<Integer, Integer> prices= new HashMap<>();

    // sales status
    protected HashMap<Integer, Boolean> salesStatus= new HashMap<>();

    public int getPrice(int productID){
//        int price = this.prices.get(productID);
//        System.out.println("sout getPrice: " + price);
//        return price;
        return 1;
    }

    public void addProduct(int newProductID, int newProductPrice) {
        prices.put(newProductID, newProductPrice);
    }
}
