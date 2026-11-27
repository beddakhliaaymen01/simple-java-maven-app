package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAppMessage() {
        App app = new App();
        assertEquals("Bonjour le monde!", app.getGreeting());
    }

    @Test
    void testAppMessageNotNull() {
        App app = new App();
        org.junit.jupiter.api.Assertions.assertNotNull(app.getGreeting());
    }
}
