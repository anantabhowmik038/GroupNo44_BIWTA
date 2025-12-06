package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

import static com.example.groupno44_biwta.Ananta.AlertClass.showAlert;
import static com.example.groupno44_biwta.Ananta.HelperClass.sceneSwitch;

public class PassengerDashboardController
{

    private void localSceneSwitch(ActionEvent actionEvent, String fxmlFileName, String title) {

        String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/Passenger/" ;
        try {
            sceneSwitch(actionEvent, fxmlPath,  "Passenger ");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error Loading View", "Could not load " );
        }
    }
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleOnMyBookingsButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "ViewMyBookingsView.fxml", "Passenger: View and Manage Bookings");
    }


    @javafx.fxml.FXML
    public void handleOnBookTicketsButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "BookTicketsView.fxml", "Passenger: Search and Book Tickets");
    }

    @javafx.fxml.FXML
    public void handleOnFeedbackAndSupportButton(ActionEvent actionEvent) {
        localSceneSwitch(actionEvent, "FeedbackAndSupportView.fxml", "Passenger: Feedback and Support");
    }

    @javafx.fxml.FXML
    public void handleOnLiveFerryTrackerButton(ActionEvent actionEvent)  {
        localSceneSwitch(actionEvent, "LiveFerryTrackerView.fxml", "Passenger: Live Ferry Tracker");
    }

    @javafx.fxml.FXML
    public void handleOnSeatVehicleManagButton(ActionEvent actionEvent) throws IOException {
        localSceneSwitch(actionEvent, "Seat-VehicleManagement.fxml", "Passenger: Seat Vehicle Management");
    }

    @javafx.fxml.FXML
    public void handleOnProfileAndPaySettingButton(ActionEvent actionEvent) throws IOException {
        localSceneSwitch(actionEvent, "ProfileAndSettingsView.fxml", "Passenger: Profile and Payment Settings");
    }

    @javafx.fxml.FXML
    public void handleOnTerminalFerryInfoButton(ActionEvent actionEvent) throws IOException {
        localSceneSwitch(actionEvent, "TerminalFerryInfoView.fxml", "Passenger: Terminal and Ferry Information");
    }

    @javafx.fxml.FXML
    public void handleOnPaymentHistoryButton(ActionEvent actionEvent) throws IOException {
        localSceneSwitch(actionEvent, "PaymentHistoryView.fxml", "Passenger: Payment History");
    }

    @javafx.fxml.FXML
    public void handleOnBackDashboardButton(ActionEvent actionEvent) {
        String mainDashboardPath = "/com/example/groupno44_biwta/Ananta/MainDashboard.fxml";
        try {

            sceneSwitch(actionEvent, mainDashboardPath, "Ferry System - Role Selection");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not load the Role Selection Dashboard.");
        }

    }
}