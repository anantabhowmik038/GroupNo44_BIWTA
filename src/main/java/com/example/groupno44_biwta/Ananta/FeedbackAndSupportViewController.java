package com.example.groupno44_biwta.Ananta;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FeedbackAndSupportViewController
{
    @javafx.fxml.FXML
    private ComboBox <String> categoryComboBox;
    @javafx.fxml.FXML
    private TextArea detailsTextArea;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextField contactTextField;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComboBox.getItems().addAll("General Feedback","Complaint","Suggestion","Technical Issue");
        categoryComboBox.setValue("General Feedback");
    }

    @javafx.fxml.FXML
    public void handleOnBackDashBoardButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleOnSubmitFeedbackButton(ActionEvent actionEvent) {
    }
}