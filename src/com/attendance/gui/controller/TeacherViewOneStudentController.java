package com.attendance.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TeacherViewOneStudentController {

    @FXML
    private Button cancelBtn;

    @FXML
    private Button confirmBtn;

    @FXML
    void toCancelScene(ActionEvent event) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    void toConfirm(ActionEvent event) {
        Stage stage = (Stage) confirmBtn.getScene().getWindow();
        stage.close();
    }
}
