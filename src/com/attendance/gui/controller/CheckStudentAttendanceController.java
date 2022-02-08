package com.attendance.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckStudentAttendanceController implements Initializable {
    @FXML
    private Button cancelButton, confirmButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void handleCancelButton(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void handleConfirmButton(ActionEvent event) {
        Stage stage = (Stage) confirmButton.getScene().getWindow();
        stage.close();
    }
}
