package com.example;

import java.io.FileReader;
import java.io.IOException;

public class ResourceLeakExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data = reader.read();
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
