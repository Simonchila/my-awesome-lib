package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TechSpiritTest {

    @Test
    void testAddition() {
        assertEquals(5, TechSpirit.add(2, 3));
    }
}