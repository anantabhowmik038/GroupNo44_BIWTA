package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BookTicketsViewController
{
    @javafx.fxml.FXML
    private TableColumn arrivalTimeTableCol;
    @javafx.fxml.FXML
    private TableColumn availableSeatTableCol;
    @javafx.fxml.FXML
    private TableColumn priceTableCol;
    @javafx.fxml.FXML
    private TableView tripTableView;
    @javafx.fxml.FXML
    private TableColumn ferryNameTableCol;
    @javafx.fxml.FXML
    private TableColumn departureTimeTableCol;
    @javafx.fxml.FXML
    private ComboBox<String> destinationPortComboBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> passengerCountComboBox;
    @javafx.fxml.FXML
    private DatePicker datePickerField;
    @javafx.fxml.FXML
    private ComboBox<String> sourcePortComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        sourcePortComboBox.getItems().addAll("Dhaka(Sadarghat)","Barishal","Chittagong","Bhola");
        destinationPortComboBox.getItems().addAll("Dhaka(Sadarghat)","Barishal","Chittagong","Bhola");
        passengerCountComboBox.getItems().addAll(1,2,3,4);

    }

    @javafx.fxml.FXML
    public void handleOnProcessButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnSearchButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnBackDashBoardButton(ActionEvent actionEvent) {
    }
}