package com.galvanize;



import java.util.ArrayList;
import java.util.HashMap;


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
        // iterate over items
        for(ArrayList<Integer> product : items.values()) {
            result += product.get(0) * product.get(1);
        }
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
}
