package com.example.groupno44_biwta.Ananta;

import javafx.scene.control.Alert;

public class AlertClass {

    public static void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
