package com.bar.manager.exception;

public class BartenderNotFound extends RuntimeException {
    public BartenderNotFound() {
        super("Bartender not found.");
    }
    public BartenderNotFound(String message) {
        super(message);
    }
}
