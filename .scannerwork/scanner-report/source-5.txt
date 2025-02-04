package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    // Private constructor to prevent instantiation
    private App() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        logger.info("Hello, World!");
        int result = add(5, 10);
        logger.info("Result: {}", result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
