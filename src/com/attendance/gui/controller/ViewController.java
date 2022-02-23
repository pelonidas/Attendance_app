package com.attendance.gui.controller;


import com.attendance.be.Student;
import com.attendance.gui.model.MockData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private Button mostMissedBtn, teacherGraphBtn;

    @FXML
    private TableView<Student> studentsTableView;

    @FXML
    private TableColumn<Student, String> fNameColumn, lNameColumn, classColumn;
    private MockData mockData;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mockData = new MockData();
        setupTableView();
    }

    private void setupTableView() {
        studentsTableView.setItems(mockData.getStudents());

        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        classColumn.setCellValueFactory(new PropertyValueFactory<>("currentClass"));
    }

    public void overviewOnAction(ActionEvent actionEvent) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/TeacherOverview.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Overview");
        stage.setScene(new Scene(root));
        stage.show();


    }

    public void oneStudentOnAction(ActionEvent actionEvent) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/TeacherViewOneStudent.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("One Student");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void handleCheckButton(ActionEvent event) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/CheckStudentAttendance.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Confirm your attendance");

        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    void toTeacherStudents(ActionEvent event) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/TeacherViewAllStudents.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("All students");
        stage.setScene(new Scene(root));
        stage.show();
    } // this button set new Scene of TeacherViewAllStudents.fxml with TeacherGraphController

    @FXML
    void toTeacherGraph(ActionEvent event) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/TeacherGraphView.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("All students");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
