package com.example.test1b_pc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label validationMessage;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Credentials for authentication
    private static final String STATIC_USERNAME = "abhishek06933@gmail.com";
    private static final String STATIC_PASSWORD = "abhi06933";

    // Counter to keep check of failed login attempts
    private int failedAttempts = 0;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {

            validationMessage.setText("Please enter both username and password.");
        } else if (username.equals(STATIC_USERNAME) && password.equals(STATIC_PASSWORD)) {

            failedAttempts = 0;
            validationMessage.setText("Success!!!");
        }
        else {
            failedAttempts++;

            if (failedAttempts < 5) {
                validationMessage.setText("Sorry, Invalid Username or Password. Attempts left: " + (5 - failedAttempts));
            }

            else {
                // Lock the account after 5 failed attempts
                validationMessage.setText("Sorry, Your Account is Locked!!!");
            }
        }
    }
}
