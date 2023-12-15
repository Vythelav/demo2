package Users;

import Bank.BankAccount;

import java.util.List;

public class Users {
    String name;
    String surname;
    String password;
    public static List<BankAccount> bankAccountslist;

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
