package com.example.groupno44_biwta.Ananta;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class SafetyCheckViewController
{
    @javafx.fxml.FXML
    private TableColumn<SafetyReport,Boolean> crewMemberDashBSafetyCheckVboxEngineConditionTableCol;
    @javafx.fxml.FXML
    private VBox crewMemberDashBSafetyCheckVboxMain;
    @javafx.fxml.FXML
    private TableView<SafetyReport> crewMemberDashBSafetyCheckVboxTableView;
    @javafx.fxml.FXML
    private TableColumn <SafetyReport,Boolean> crewMemberDashBSafetyCheckVboxFireExtinguisherTableCol;
    @javafx.fxml.FXML
    private TableColumn<SafetyReport,Boolean> crewMemberDashBSafetyCheckVboxLifeJacketsTableCol;

    @javafx.fxml.FXML
    public void initialize() {

    }
}