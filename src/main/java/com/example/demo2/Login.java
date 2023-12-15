package com.example.demo2;

import Bank.BankAccount;
import Bank.BankAplication;
import Users.Users;

import java.util.ArrayList;
import java.util.List;

public class Login {

    public static List<Users> users = new ArrayList<>();

   static  {
    BankAplication bankAccount = new BankAplication();
    Users userOne = new Users("Ivan","Ivanov","1234");
    users.add(userOne);

    }
    public static List<Users> getUsers() {
        return users;
    }
}
