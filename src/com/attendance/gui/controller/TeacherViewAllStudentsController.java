package com.attendance.gui.controller;

import com.attendance.be.Student;
import com.attendance.gui.model.MockData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherViewAllStudentsController implements Initializable {

    private MockData model;

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

    @FXML
    private ComboBox<String> comboBox;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new MockData();
        //ObservableList<String> test = FXCollections.observableArrayList();
        //test.addAll(model.getMonths());
        comboBox.setItems(model.getMonths());
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
