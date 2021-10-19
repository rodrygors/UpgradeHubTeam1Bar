package com.bar.manager.exception;

public class ClientNotFound extends RuntimeException {
    public ClientNotFound() {
        super("Client not found.");
    }
    public ClientNotFound(String message) {
        super(message);
    }
}
