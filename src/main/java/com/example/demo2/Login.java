package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

public class Login {
    public static List<Users> users = new ArrayList<>();

   static  {
    Users userOne = new Users("Ivan","Ivanov","1234");
    users.add(userOne);

    }
    public List<Users> getUsers() {
        return users;
    }
}
