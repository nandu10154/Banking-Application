package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    public static void main(String[] args) {
        // Example JSON string
        String jsonString = "{\"name\": \"John\", \"age\": 30}";

        // Create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Parse JSON string into a Java object
            MyClass obj = objectMapper.readValue(jsonString, MyClass.class);
            System.out.println("Name: " + obj.getName());
            System.out.println("Age: " + obj.getAge());

            // Serialize Java object to JSON string
            String jsonOutput = objectMapper.writeValueAsString(obj);
            System.out.println("Serialized JSON: " + jsonOutput);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

// Define a sample class to represent JSON structure
class MyClass {
    private String name;
    private int age;

    // Constructor, getters, and setters
    public MyClass() {}

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
