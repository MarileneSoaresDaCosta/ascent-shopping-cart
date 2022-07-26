package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<Integer, Item> storage = new HashMap<>();

    Inventory() {
        this.storage = new HashMap<>();
    }

    public void addItem(int id, int quantity, int price, boolean onSale) {
        Item addedItem = new Item(id, price, onSale);
        this.storage.put(quantity, addedItem);
    }

    public HashMap<Integer, Item> getStorage(){
        HashMap<Integer, Item> copy = new HashMap<>(storage);
        return copy;
    }


    public int getItemQuantity(int searchedId) {
        // find item in storage
        for (Map.Entry<Integer, Item> entry : storage.entrySet()){
            Integer quantity = entry.getKey();
            Item item = entry.getValue();
            int id = item.getId();
            if ( searchedId == id) {
                return quantity;
            }
        }
        return 0;
    }

    public void update(int searchedId, int addedQuantity) {
        // find item in storage
        for (Map.Entry<Integer, Item> entry : storage.entrySet()){
            Integer quantity = entry.getKey();
            Item item = entry.getValue();
            int id = item.getId();
            if ( searchedId == id) {
                // add new entry
                storage.put( quantity + addedQuantity, item);
                // remove old entry
                storage.remove(quantity, item);
            } else {
                // if id not found
                System.out.println("id not found");
            }
        }

    }


}
