package com.example;

public class HardcodedCredentialsExample {
    public static void main(String[] args) {
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        System.out.println("Logged in as " + username);
    }
}
