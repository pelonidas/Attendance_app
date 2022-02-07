package com.attendance.gui.controller;


import com.attendance.be.Student;
import com.attendance.gui.model.MockData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.text.TabableView;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
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
        ArrayList<String> fNameList = new ArrayList<>();
        fNameList.add("Tom");
        fNameList.add("Maria");
        fNameList.add("Steven");
        fNameList.add("John");
        fNameList.add("Bill");
        fNameList.add("Noah");
        fNameList.add("Oliver");
        fNameList.add("Elijah");
        fNameList.add("William");

        ArrayList<String> lNameList = new ArrayList<>();
        lNameList.add("Smith");
        lNameList.add("Williams");
        lNameList.add("Brown");
        lNameList.add("Jones");
        lNameList.add("Garcia");
        lNameList.add("Miller");
        lNameList.add("Davis");

        ArrayList<String> classes = new ArrayList<>();
        classes.add("Medicine");
        classes.add("Law");
        classes.add("Architecture");
        classes.add("Art & Design");
        classes.add("Accounting & Finance");

        ArrayList<Integer> missed = new ArrayList<>();
        missed.add(6);
        missed.add(7);
        missed.add(2);
        missed.add(12);
        missed.add(2);

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
}
