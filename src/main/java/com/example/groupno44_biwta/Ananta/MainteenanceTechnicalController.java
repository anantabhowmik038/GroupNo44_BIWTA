package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainteenanceTechnicalController
{
    @javafx.fxml.FXML
    private TextField deviceIdTextField;
    @javafx.fxml.FXML
    private ComboBox <String>ferryIdComboBox;
    @javafx.fxml.FXML
    private DatePicker maintenanceDatePicker;
    @javafx.fxml.FXML
    private TextArea textFieldAreaForNoti;
    @javafx.fxml.FXML
    private ComboBox<String> maintenanceStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> engineerIdComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> problemTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        ferryIdComboBox.getItems().addAll("DHA-CHI","BAR-DHA","BAR-CHI","DHA-KHU");
        maintenanceStatusComboBox.getItems().addAll("Pending", "In Progress", "Completed");
        engineerIdComboBox.getItems().addAll("Tech-44A", "Sr. Engineer (Bhowmik)", "Ananta-31");
        problemTypeComboBox.getItems().addAll("Electrical Fault","Mechanical Failure","Software Glitch","Hardware Glitch");

    }

    @javafx.fxml.FXML
    public void handleOnSaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnClearButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnBackDashboardButton(ActionEvent actionEvent) {
    }
}