package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmergencyIncidentReportController
{
    @javafx.fxml.FXML
    private TextArea actionTakenTextArea;
    @javafx.fxml.FXML
    private DatePicker datePickerField;
    @javafx.fxml.FXML
    private TextField casualtyCountTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private ComboBox <String>incidentTypeComboBox;
    @javafx.fxml.FXML
    private TextField locationTextField;
    @javafx.fxml.FXML
    private ComboBox<String> severityComboBox;
    @javafx.fxml.FXML
    private TextField reporterNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOnBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnSubmitButton(ActionEvent actionEvent) {
    }
}