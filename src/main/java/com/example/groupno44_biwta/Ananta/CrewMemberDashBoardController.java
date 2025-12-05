package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

public class CrewMemberDashBoardController
{
    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void switchToGoalView(ActionEvent event, String fxmlFileName, String title) {
        try {
            String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/CrewMember/" + fxmlFileName;
            HelperClass.sceneSwitch(event, fxmlPath, title);
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load the view: " + fxmlFileName + ". FXML file not found.");
        }
    }
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOnBackButton(ActionEvent actionEvent) {
        try {
            String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/MainDashboard.fxml";
            HelperClass.sceneSwitch(actionEvent, fxmlPath, "Ferry System - Role Selection");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not return to Main Dashboard.");
        }
    }

    @javafx.fxml.FXML
    public void handleOnPassengerAnnouncementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnPassengerFeedbackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnPassengerBoardingButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "PassengerBoarding.fxml", "Crew Member: Passenger Boarding Management");
    }

    @javafx.fxml.FXML
    public void handleOnDailyOperationsSafetyButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent,"DailyOperationsAndSafety.fxml", "Crew Member: Daily Operations & Safety");
    }

    @javafx.fxml.FXML
    public void handleOnMainteenanceTechnicalLogButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnEmergencyIncidentReportButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "EmergencyIncidentReport.fxml", "Crew Member: Emergency Incident Report");
    }

    @javafx.fxml.FXML
    public void handleOnInventorySuppliesButton(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Feature Not Ready", "Inventory & Supplies view is not yet implemented.");
    }

    @javafx.fxml.FXML
    public void handleOnRealTimeStatusMonitorButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "RealTimeStatusMonitor.fxml", "Crew Member: Real-Time Status Monitor");
    }
}