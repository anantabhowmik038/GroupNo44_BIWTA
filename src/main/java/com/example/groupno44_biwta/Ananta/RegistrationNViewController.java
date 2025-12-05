package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class RegistrationNViewController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private TextArea alertMessage;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private TextField usernameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> accountTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        accountTypeComboBox.getItems().addAll("Crew Member","Passenger");
        accountTypeComboBox.setValue("Passenger");

    }

    @javafx.fxml.FXML
    public void handleOnRegisterAccount(ActionEvent actionEvent) {
        String username = usernameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String phoneNumber = phoneNumberTextField.getText().trim();
        String password = passwordField.getText();
        String accountType = accountTypeComboBox.getValue();

        if (username.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty() || accountType == null) {
            alertMessage.setText("ERROR: Please fill in all fields.");
            return;
        }
        String userId = "PLACEHOLDER-ID";
        String ferryIdAssigned;
        if (accountType.equals("Crew Member")) {
            ferryIdAssigned = "TBD";
        } else {
            ferryIdAssigned = null;
        }
        UserMemberPassenger newUser = new UserMemberPassenger(
                userId,
                username,
                password,
                accountType,
                email,
                phoneNumber,
                ferryIdAssigned
        );
        alertMessage(Alert.AlertType.INFORMATION, "Registration Successful! ",
                "Validation successful for " + username + " (" + accountType + "). Returning to Login.");

        // 2. Clear the form
        clearForm();
        System.out.println("Data captured and model created: " + newUser);

        // 3. Scene Switching to Login Window using HelperClass
        try {
            // FXML file name is Login-View.fxml (must be in the Ananta resource folder)
            HelperClass.sceneSwitch(actionEvent, "Login-View.fxml", "User Login");
        }
        catch (IOException e) {
            e.printStackTrace();
            alertMessage(Alert.AlertType.ERROR, "Error", "Could not load the Login page.");
        }
    }


    private void clearForm() {
        usernameTextField.clear();
        emailTextField.clear();
        phoneNumberTextField.clear();
        passwordField.clear();
        accountTypeComboBox.setValue("Passenger");
    }

    private void alertMessage(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}