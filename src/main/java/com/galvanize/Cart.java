package com.galvanize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Cart{
    // items { integer quantity : Item item}
    private HashMap<Integer, Item> items = new HashMap<>();
    public boolean isEmpty() {
        return true;
    }

    public int totalPrice() {
        if (items.size() == 0) {
            return 0;
        }
        int result = 0;
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            Integer quantity = entry.getKey();
            Item item = entry.getValue();
            int price = item.getPrice();
            result += quantity * price;
        }

        return result;
    }

    public void addItem(int id, int quantity, int price, boolean onSale) {
        Item addedItem = new Item(id, price, onSale);
        this.items.put(quantity, addedItem);
    }

    public int itemQuantities(){
        Integer result = 0;
        for (Integer q : items.keySet()) {
            result += q;
        }
        return result;
    }

    public HashMap<Integer, Item> itemizedList(){
        HashMap<Integer, Item> itemsCopy = new HashMap<>(items);
        return itemsCopy;
    }



    public HashMap<Integer, Item> onSaleItems() {
        HashMap<Integer, Item> itemsOnSale = new HashMap<>();
        // iterate over items and pick only items onSale
        for (Map.Entry<Integer, Item> entry : items.entrySet()) {
            Integer quantity = entry.getKey();
            Item item = entry.getValue();
            boolean onSale = item.isOnSale();
            if (onSale) {
                itemsOnSale.put(quantity, item);
            }
        }
        return itemsOnSale;
    }
}
