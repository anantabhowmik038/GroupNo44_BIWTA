package com.example.groupno44_biwta.Ananta;
import com.example.groupno44_biwta.Ananta.HelperClass;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import java.io.IOException;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;
import static com.example.groupno44_biwta.Ananta.HelperClass.sceneSwitch;


public class CrewMemberDashBoardController
{

    private void localSceneSwitch(ActionEvent event, String fxmlFileName, String title) {
        String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/CrewMember/" + fxmlFileName;
        try {
            sceneSwitch(event, fxmlPath, title);
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error Loading View", "Could not load " + fxmlFileName);
        }
    }
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOnBackButton(ActionEvent actionEvent) {
        String mainDashboardPath = "/com/example/groupno44_biwta/Ananta/fxml/MainDashboard.fxml";
        try {
            sceneSwitch(actionEvent, mainDashboardPath, "Ferry System - Role Selection");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load the Role Selection Dashboard.");
        }

    }

    @javafx.fxml.FXML
    public void handleOnPassengerAnnouncementButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "PassengerAnnouncement.fxml", "Crew Member: Passenger Boarding Management");
    }

    @javafx.fxml.FXML
    public void handleOnPassengerFeedbackButton(ActionEvent actionEvent) {
        localSceneSwitch(actionEvent, "PassengerFeedback.fxml", "Crew Member: Passenger Feedback");
    }

    @javafx.fxml.FXML
    public void handleOnPassengerBoardingButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "PassengerBoarding.fxml", "Crew Member: Passenger Boarding Management");
    }

    @javafx.fxml.FXML
    public void handleOnDailyOperationsSafetyButton(ActionEvent actionEvent) {
        localSceneSwitch(actionEvent,"DailyOperationsAndSafety.fxml", "Crew Member: Daily Operations & Safety");
    }

    @Deprecated
    public void handleOnMainteenanceTechnicalLogButton(ActionEvent actionEvent) {
        localSceneSwitch(actionEvent,"MaintenanceTechnical.fxml", "Crew Member: Maintenance Technical log");
    }

    @javafx.fxml.FXML
    public void handleOnEmergencyIncidentReportButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "EmergencyIncidentReport.fxml", "Crew Member: Emergency Incident Report");
    }

    @javafx.fxml.FXML
    public void handleOnInventorySuppliesButton(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Feature Not Ready", "Inventory & Supplies view is not yet implemented.");
    }

    @javafx.fxml.FXML
    public void handleOnRealTimeStatusMonitorButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "RealTimeStatusMonitor.fxml", "Crew Member: Real-Time Status Monitor");
    }

    @javafx.fxml.FXML
    public void handleOnMaintenanceTechnicalLogButton(ActionEvent actionEvent) {
        localSceneSwitch(actionEvent,"MaintenanceTechnical.fxml", "Crew Member: Maintenance Technical log");
    }
}