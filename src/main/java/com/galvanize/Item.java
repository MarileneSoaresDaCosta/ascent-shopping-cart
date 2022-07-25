package com.galvanize;

public class Item {
    protected int id;
    protected int price;
    protected boolean onSale = false;

    Item(int id, int price, boolean onSale) {
        this.id = id;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public boolean isOnSale(){
        return this.onSale;
    }

}
