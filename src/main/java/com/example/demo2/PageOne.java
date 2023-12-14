package com.example.demo2;

import Users.Users;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ArrayList;
import java.util.List;


public class PageOne {
    @FXML
    public Label usernameText;

    public void setUsers(List<Users> users) {
       String  username = users.get(0).getName();
        usernameText.setText(username);
    }
}
