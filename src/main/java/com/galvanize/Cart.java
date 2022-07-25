package com.galvanize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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

    public void addItem(int id, int quantity, int price) {
        Item addedItem = new Item(id, price);
        this.items.put(quantity, addedItem);
    }

    public int itemQuantities(){
        return items.size();
    }

    public HashMap<Integer, Item> itemizedList(){
        HashMap<Integer, Item> itemsCopy = new HashMap<>(items);
        return itemsCopy;
    }
}
