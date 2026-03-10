package com.example.spring_rest_api_messaging_app.dto;

public class UserDTO {

    private String firstName;
    private String lastName;

    public UserDTO() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}