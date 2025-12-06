package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;

public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField userIdTextField;
    @javafx.fxml.FXML
    private PasswordField passwordField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void handleOnCreateAccountButton(ActionEvent actionEvent) {
        try {
            HelperClass.sceneSwitch(actionEvent, "RegistrationN-View.fxml", "Create Account");
        }
        catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Unable to load the Create Account page.");
        }
    }

    @javafx.fxml.FXML
    public void handleOnLogInButton(ActionEvent actionEvent) {
    }
//    private void showAlert(Alert.AlertType type, String title, String message) {
//        Alert alert = new Alert(type);
//        alert.setTitle(title);
//        alert.setHeaderText(null);
//        alert.setContentText(message);
//        alert.showAndWait();
//    }
}