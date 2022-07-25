package com.galvanize;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest {
    @Test
    public void createsItem() {
        Item newItem = new Item(203, 12, true);
        assertEquals(12, newItem.getPrice());
        assertTrue(newItem.isOnSale());
    }

}
