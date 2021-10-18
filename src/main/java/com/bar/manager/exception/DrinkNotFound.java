package com.bar.manager.exception;

public class DrinkNotFound extends RuntimeException {
    public DrinkNotFound() {
        super("Drink not found.");
    }
    public DrinkNotFound(String message) {
        super(message);
    }
}
