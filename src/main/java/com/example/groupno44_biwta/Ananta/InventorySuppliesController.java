package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;
import static com.example.groupno44_biwta.Ananta.HelperClass.sceneSwitch;

public class InventorySuppliesController
{
    @javafx.fxml.FXML
    private TextField itemNameTextField;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> itemNameTableCol;
    @javafx.fxml.FXML
    private DatePicker expiryDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableView <InventoryItem> tableView;
    @javafx.fxml.FXML
    private ComboBox <String> locationComboBox;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem, LocalDate> dateTableCol;
    @javafx.fxml.FXML
    private TextField itemIdTextField;
    @javafx.fxml.FXML
    private ComboBox <String> categoryComboBox;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> itemIdTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> descriptionTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> categoryTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> locationTableCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryItem,String> quantityTableCol;
    @javafx.fxml.FXML
    private TextField quantityTextField;


    @javafx.fxml.FXML
    public void initialize() {

        categoryComboBox.getItems().addAll("Mechanical Parts","Safety & Emergency","Consumables & Supplies","Electrical & Navigation");
        locationComboBox.getItems().addAll( "Main Warehouse","DHA-CHI","BAR-DHA","BAR-CHI","DHA-KHU");

        itemIdTableCol.setCellValueFactory(new PropertyValueFactory<>("itemId"));
        itemNameTableCol.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        quantityTableCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        categoryTableCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        locationTableCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        dateTableCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        descriptionTableCol.setCellValueFactory(new PropertyValueFactory<>("description"));



    }

    private ArrayList<InventoryItem> InventoryItemList = new ArrayList<>();

    @javafx.fxml.FXML
    public void handleOnAddButton(ActionEvent actionEvent) {

        String itemId = itemIdTextField.getText().trim();
        String itemName = itemNameTextField.getText().trim();
        String quantityStr = quantityTextField.getText().trim();
        String category = categoryComboBox.getValue();
        String location = locationComboBox.getValue();
        LocalDate expiryDate = expiryDatePicker.getValue();
        String description = descriptionTextArea.getText().trim();

        if (itemId.isEmpty() || itemName.isEmpty() || quantityStr.isEmpty() || category == null || location == null) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please fill in Item ID, Name, Quantity, Category, and Location.");
            return;
        }


    }

    @javafx.fxml.FXML
    public void handleOnUpdateStockButton(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Update Stock", "Feature to update stock is implemented.");
    }

    @javafx.fxml.FXML
    public void handleOnBackDashboardButton(ActionEvent actionEvent) {
        String fxmlPath = "/com/example/groupno44_biwta/Ananta/CrewMemberDashBoard.fxml";

        try {
            sceneSwitch(actionEvent, fxmlPath, "Crew Member Dashboard");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load the Crew Member Dashboard.");
        }


    }
}