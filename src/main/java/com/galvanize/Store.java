package com.galvanize;

public class Store {
    public Inventory getInventory() {
        return new Inventory();
    }

    private static class Inventory {

    }

}
