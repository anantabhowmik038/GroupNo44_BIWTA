package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.IOException;
import java.io.ObjectInputFilter;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;
import static com.example.groupno44_biwta.Ananta.HelperClass.sceneSwitch;

public class LiveFerryTrackerController
{
    @javafx.fxml.FXML
    private Text routeComboBox;
    @javafx.fxml.FXML
    private ComboBox <String>routeFiltterComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn ferryIdTableCol;
    @javafx.fxml.FXML
    private TextField ferryIdTextField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn routeTableCol;
    @javafx.fxml.FXML
    private TableColumn statusTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        routeFiltterComboBox.getItems().addAll("DHA-CHI","BAR-DHA","BAR-CHI","DHA-KHU");
        statusComboBox.getItems().addAll("On Time","Delayed", "Docked", "Out of Service");

//        ferryIdTableCol.setCellValueFactory(new PropertyValueFactory<>(""));
    }

    @javafx.fxml.FXML
    public void handleOnBackDashboardButton(ActionEvent actionEvent) {
        String fxmlPath = "/com/example/groupno44_biwta/Ananta/PassengerDashboard.fxml";

        try {
            sceneSwitch(actionEvent, fxmlPath, "Crew Member Dashboard");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load the Crew Member Dashboard.");
        }
    }

    @javafx.fxml.FXML
    public void handleOnRefreshButton(ActionEvent actionEvent) {

    }
}