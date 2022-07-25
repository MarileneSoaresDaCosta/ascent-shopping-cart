package com.galvanize;

public class Application {
    public static void main() {
        System.out.println("Shopping Cart is starting ===");
        Cart cart = new Cart();
        System.out.println("car should be empty: " + cart.isEmpty());

        // adding items to cart
        cart.addItem(201, 5, 12, true);
        cart.addItem(203, 1, 36, false);
        cart.addItem(205, 3, 15, true);
        cart.addItem(207, 4, 25, false);
        cart.addItem(209, 2, 20, false);

        System.out.println("total quantities = 15 : " +cart.itemQuantities());
        System.out.println("different items = 5 : "  + cart.itemizedList().size());
        System.out.println("total price = 281 : " + cart.totalPrice());
        System.out.println("items on Sale = 2 : " + cart.onSaleItems().size());


    }
}
