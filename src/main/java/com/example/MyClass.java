package com.example;

public class MyClass {
    public String getMessage() {
        return "Hello from my-gradle-app!";
    }

    public static void main(String[] args) {
        System.out.println(new MyClass().getMessage());
    }
}
