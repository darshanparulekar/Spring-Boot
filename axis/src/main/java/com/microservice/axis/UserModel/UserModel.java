package com.microservice.axis.UserModel;

public class UserModel {
    private String name;
    private String email;

    // Default constructor
    public UserModel() {
    }

    // Constructor with parameters
    public UserModel(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}