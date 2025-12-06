package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PassengerFeedbackController
{
    @javafx.fxml.FXML
    private ComboBox <String>ferryIdComboBox;
    @javafx.fxml.FXML
    private DatePicker travelDatePicker;
    @javafx.fxml.FXML
    private TextField routeInfoTextField;
    @javafx.fxml.FXML
    private TextField passengerIdTextField;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        ferryIdComboBox.getItems().addAll("DHA-CHI","BAR-DHA","BAR-CHI","DHA-KHU");
        ferryIdComboBox.setValue("DHA-CHI");

    }

    @javafx.fxml.FXML
    public void handleOnSubmitFeedBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnBackDashBoardButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnCancelButton(ActionEvent actionEvent) {
    }
}