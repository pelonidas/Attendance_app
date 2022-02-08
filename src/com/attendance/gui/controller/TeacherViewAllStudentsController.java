package com.attendance.gui.controller;

import com.attendance.be.Student;
import com.attendance.gui.model.MockData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherViewAllStudentsController implements Initializable {

    @FXML
    private Button cancelBtn;

    @FXML
    private TableColumn<Student, String> tableClmFName;

    @FXML
    private TableColumn<Student, Integer> tableClmHours;

    @FXML
    private TableColumn<Student, String> tableClmLName;

    @FXML
    private TableView<Student> tableViewMiss;

    private MockData model;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new MockData();
    }

    @FXML
    void toCancelScene(ActionEvent event) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

    void setTableView () {
        tableViewMiss.setItems(model.getStudents());
        tableClmFName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        tableClmLName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tableClmHours.setCellValueFactory(new PropertyValueFactory<>("missedDays"));

        tableClmHours.setSortType(TableColumn.SortType.DESCENDING);
        tableViewMiss.getSortOrder().add(tableClmHours);
        tableViewMiss.sort();
    }

    @FXML
    void toShowTableView(ActionEvent event) {
        setTableView();
    }
}
