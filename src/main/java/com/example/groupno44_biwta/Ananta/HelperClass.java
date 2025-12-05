package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelperClass {

    public static void sceneSwitch(ActionEvent event, String fxmlFile, String title) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelperClass.class.getResource(fxmlFile));

        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
