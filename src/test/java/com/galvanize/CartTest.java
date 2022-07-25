package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
//    Given that I visit the site, when I begin shopping, then I expect my cart to be empty.
    @Test
    public void cartExistsAndIsEmpty(){
        Cart newCart =new Cart();
        assertEquals(true, newCart.isEmpty());
    }
}
