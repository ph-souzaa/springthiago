package com.example.users.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Integer id) {
        super("Usuário de id: " + id + " não foi encontrado.");
    }
}
