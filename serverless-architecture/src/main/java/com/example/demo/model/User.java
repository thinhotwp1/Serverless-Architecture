package com.example.demo.model;

public class User {
    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{id='%s', email='%s'}".formatted(userId, email);
    }
}
