package Users;

import Bank.BankAccount;

import java.util.List;

public class Users {
    String name;
    String surname;
    String password;
    List<BankAccount> bankAccountslist;

    public Users() {

    }

    public Users(String name, String surname, String password, List<BankAccount> bankAccountslist) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.bankAccountslist = bankAccountslist;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;

    }
}
