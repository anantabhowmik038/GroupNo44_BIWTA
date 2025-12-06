package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;

public class PassengerAnnouncementController
{
    @javafx.fxml.FXML
    private ComboBox<String> targetFerryIdComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> targetRecipientComboBox;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private CheckBox sendMesgEmailCheckBox;
    @javafx.fxml.FXML
    private ComboBox <String> announcementTypeComboBox;
    @javafx.fxml.FXML
    private TextArea messageBodyTextArea;
    @javafx.fxml.FXML
    private CheckBox sendMesgSMSCheckBox;

    @javafx.fxml.FXML
    public void initialize() {

        targetFerryIdComboBox.getItems().addAll("DHA-CHI","BAR-DHA","BAR-CHI","DHA-KHU");
        announcementTypeComboBox.getItems().addAll("Urgent","Delay","General Info","Safety");
        targetRecipientComboBox.getItems().addAll("All Passengers","Crew Only");

        sendMesgEmailCheckBox.setOnAction(event -> {
            if (sendMesgEmailCheckBox.isSelected()) {
                sendMesgSMSCheckBox.setSelected(false);
            }
        });
        sendMesgSMSCheckBox.setOnAction(event -> {
            if (sendMesgSMSCheckBox.isSelected()) {
                sendMesgEmailCheckBox.setSelected(false);
            }
        });

        sendMesgEmailCheckBox.setSelected(false);
        sendMesgSMSCheckBox.setSelected(false);
    }

    @javafx.fxml.FXML
    public void handleOnSendAnnouncementButton(ActionEvent actionEvent) {


        String announcementMessage = messageBodyTextArea.getText().trim();
        String ferryId = targetFerryIdComboBox.getValue();
        String accType = announcementTypeComboBox.getValue();

        if (ferryId == null|| ferryId.trim().isEmpty()||accType ==null||accType.trim().isEmpty()|| announcementMessage.isEmpty()) {
            messageBodyTextArea.setText("ERROR: Please fill in all required fields.");
            return;
        }
    }

    @javafx.fxml.FXML
    public void handleOnBackDashBoardButton(ActionEvent actionEvent) {

        try {
            HelperClass.sceneSwitch(actionEvent, "RegistrationN-View.fxml", "Create Account");
        }
        catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Unable to load the Create Account page.");
        }
    }

    @javafx.fxml.FXML
    public void handleOnClearFormButton(ActionEvent actionEvent) {
    }


}