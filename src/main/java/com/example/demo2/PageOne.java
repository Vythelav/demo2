package com.example.demo2;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class PageOne implements Initializable {
    @FXML
    public Label usernameText;

    public void setUsers() {
       String  username = Login.users.get(0).getName();
        usernameText.setText("Добро пожаловать"+ username);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUsers();
    }
}
