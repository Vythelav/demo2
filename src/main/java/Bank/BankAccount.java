package Bank;

import Users.Users;

import java.util.List;

public class BankAccount {
    private int numberAccount;
    private String Balance;
    public List<Users> users;

    public BankAccount(){

    }
    public BankAccount(String balance, List<Users> users , int numberAccount) {
        this.Balance = balance;
        this.users = users;
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getBalance() {
        return Balance;
    }
}

