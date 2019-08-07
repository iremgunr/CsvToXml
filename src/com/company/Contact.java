package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> roles;

    public Contact(String userName, String firstName, String lastName, String email, List<String> role) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = role;
    }


    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }


    public void setRole(List<String> role) {
        this.roles = role;
    }


    public List<String> getRole() {
        return roles;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + roles +
                '}';
    }
}



