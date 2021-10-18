package com.bar.manager.exception;

public class ClientNotFound extends RuntimeException {
    public ClientNotFound() {
        super("Drink not found.");
    }
    public ClientNotFound(String message) {
        super(message);
    }
}
