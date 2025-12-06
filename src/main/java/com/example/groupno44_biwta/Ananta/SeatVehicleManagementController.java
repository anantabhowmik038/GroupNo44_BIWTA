package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SeatVehicleManagementController
{
    @javafx.fxml.FXML
    private TableColumn deckTableCol;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private ComboBox <String>deckComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        deckComboBox.getItems().addAll("Upper Deck","Lower Deck");
    }

    @javafx.fxml.FXML
    public void handleOnBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnConfirmButton(ActionEvent actionEvent) {
    }
}