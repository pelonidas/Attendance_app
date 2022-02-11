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
import java.util.Arrays;
import java.util.List;
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
        setupData();
        setupTableView();
    }

    private void setupTableView() {
        studentsTableView.setItems(mockData.getStudents());

        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        classColumn.setCellValueFactory(new PropertyValueFactory<>("currentClass"));
    }
    private void setupData() {
        List<String> fNameList = Arrays.asList("Tom", "Maria", "Steven", "John", "Bill", "Noah", "Oliver", "Elijah", "William");
        List<String> lNameList = Arrays.asList("Smith","Williams","Brown","Jones","Garcia","Miller","Davis");
        List<String> classes = Arrays.asList("Medicine", "Law", "Architecture", "Art&Design", "Accounting & Finance");
        List<Integer> missed = Arrays.asList(6, 7, 2, 12, 2, 5);

        for (int i = 0; i < 50; i++) {
            int fRand = (int)(Math.random() * fNameList.size());
            int lRand = (int)(Math.random() * lNameList.size());
            int cRand = (int)(Math.random() * classes.size());
            int mRand = (int)(Math.random() * missed.size());

            Student student = new Student(i);
            student.setFirstName(fNameList.get(fRand));
            student.setLastName(lNameList.get(lRand));
            student.setCurrentClass(classes.get(cRand));
            student.setMissedDays(missed.get(mRand));
            mockData.getStudents().add(student);
        }
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
