package com.example.demo2;

import Bank.BankAccount;
import Users.Users;

import java.util.ArrayList;
import java.util.List;

public class Login {

    public static List<Users> users = new ArrayList<>();

   static  {
       BankAccount bankAccount = new BankAccount();
    Users userOne = new Users("Ivan","Ivanov","1234",  );
    users.add(userOne);
    pageOne.setUsers(users);
    }
    public static List<Users> getUsers() {
        return users;
    }
}
