package Bank;

import Users.Users;
import com.example.demo2.Login;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BankAplication {
    @FXML
    private Button buttonBalance;
    @FXML
    private TextField textFieldBalance;

    @FXML
    protected void addBalance(){
        BankAccount bankAccount = new BankAccount(textFieldBalance.getText(), Login.getUsers(),12313132);

    }
}

