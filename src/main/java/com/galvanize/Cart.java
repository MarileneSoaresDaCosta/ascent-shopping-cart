package com.galvanize;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class Cart extends Store{

    private HashMap<Integer, ArrayList<Integer>> items = new HashMap<>();
    public boolean isEmpty() {
        return true;
    }

    public int totalPrice() {
        if (items.size() == 0) {
            return 0;
        }
        int result = 0;

        // iterate over items in cart, picking quantity and looking for price in store
        // get price
//        for (int i = 0; i < items.size(); i++) {
//            int price =
//        }


        return result;
    }

    public void addItem(int productID, int quantity) {
        // get price for productID
        int price = super.getPrice(productID);
        // create array with price and quantity
        ArrayList<Integer> item = new ArrayList<>();
        item.add(quantity);
        item.add(price);
        this.items.put(productID, item);
    }

    public Set<Integer> getProductIds(){
        Set<Integer> productIdsList = this.items.keySet();
        return productIdsList;
    }
}
