package com.example.demo2;

public class Users {
    String name;
    String surname;
    String password;

    public Users() {

    }

    public Users(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;

    }
}
