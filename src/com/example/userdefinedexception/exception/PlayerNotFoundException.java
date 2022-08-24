package com.example.userdefinedexception.exception;

public class PlayerNotFoundException extends Exception {
    public PlayerNotFoundException(String message) {
        // compiler automatically calls the no-argument constructor of parent class
        super(message);
    }
}
