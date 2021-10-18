package com.bar.manager.excepetion;

public class BartenderNotFound extends RuntimeException {
    public BartenderNotFound() {
        super("Bartender not found.");
    }

    public BartenderNotFound(String message) {
        super(message);
    }
}
