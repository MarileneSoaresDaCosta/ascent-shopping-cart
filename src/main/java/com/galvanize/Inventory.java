package com.galvanize;

import java.util.HashMap;

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


}
