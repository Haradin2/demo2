package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField gebruikersnaam;

    @FXML
    private Label info;

    @FXML
    private Button knop;

    @FXML
    private PasswordField wachtwoord;

    @FXML
    void inloggen(ActionEvent event) throws IOException {
        if(checkLogin()){
            HelloApplication.changeScreen(event, "hello-view.fxml");
        }
        else{
            info.setText("mislukt");
        }
    }

    private boolean checkLogin(){
        if(gebruikersnaam.getText().equals("Arthur") && wachtwoord.getText().equals("123456")){
            return true;
        }
        return false;
    }

}
