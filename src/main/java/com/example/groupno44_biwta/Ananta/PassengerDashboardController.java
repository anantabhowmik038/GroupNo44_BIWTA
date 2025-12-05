package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;

public class PassengerDashboardController
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

            String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/Passenger/" + fxmlFileName;
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
    public void handleOnMyBookingsButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "ViewMyBookingsView.fxml", "Passenger: View and Manage Bookings");
    }


    @javafx.fxml.FXML
    public void handleOnBookTicketsButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "BookTicketsView.fxml", "Passenger: Search and Book Tickets");
    }

    @javafx.fxml.FXML
    public void handleOnFeedbackAndSupportButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "FeedbackAndSupportView.fxml", "Passenger: Feedback and Support");
    }

    @javafx.fxml.FXML
    public void handleOnLiveFerryTrackerButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "LiveFerryTrackerView.fxml", "Passenger: Live Ferry Tracker");
    }

    @javafx.fxml.FXML
    public void handleOnSeatVehicleManagButton(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Feature Not Ready", "Seat and Vehicle Management is not yet implemented.");
    }

    @javafx.fxml.FXML
    public void handleOnProfileAndPaySettingButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "ProfileAndSettingsView.fxml", "Passenger: Profile and Payment Settings");
    }

    @javafx.fxml.FXML
    public void handleOnTerminalFerryInfoButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "TerminalFerryInfoView.fxml", "Passenger: Terminal and Ferry Information");
    }

    @javafx.fxml.FXML
    public void handleOnPaymentHistoryButton(ActionEvent actionEvent) {
        switchToGoalView(actionEvent, "PaymentHistoryView.fxml", "Passenger: Payment History");
    }

    @javafx.fxml.FXML
    public void handleOnBackDashboardButton(ActionEvent actionEvent) {
        try {
            String fxmlPath = "/com/example/groupno44_biwta/Ananta/fxml/MainDashboard.fxml";
            HelperClass.sceneSwitch(actionEvent, fxmlPath, "Ferry System - Role Selection");
        } catch (IOException e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Navigation Error", "Could not return to Main Dashboard.");
        }
    }
}