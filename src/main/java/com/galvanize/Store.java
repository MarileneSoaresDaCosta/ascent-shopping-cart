package com.galvanize;

import java.util.Collection;
import java.util.HashMap;

public class Store {
    private Inventory inventory = new Inventory();

    public Inventory getInventory(){
        return this.inventory;
    }

    public HashMap<Integer, Item> getInventoryStorage() {
        return this.inventory.getStorage();
    }

}
