package com.artmmslv.mapreducer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testGreeting() {
        String greeting = Main.greeting();
        assertNotNull(greeting);
        assertNotEquals(greeting, "");
    }
}
