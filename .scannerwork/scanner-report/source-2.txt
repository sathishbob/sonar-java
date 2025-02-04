package com.example;

public class StringConcatenationExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append(i);
        }
        System.out.println(result.toString());
    }
}
