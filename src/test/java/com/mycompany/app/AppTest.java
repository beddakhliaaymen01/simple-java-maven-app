package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAppMessage() {
        App app = new App();
        assertEquals("Bonjour le monde!", app.getMessage());
    }

    @Test
    void testAppMessageAgain() {
        App app = new App();
        assertEquals("Bonjour le monde!", app.getMessage());
    }
}
