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

        for (int i = 0; i < 50; i++) {
            int fRand = (int)(Math.random() * fNameList.size());
            int lRand = (int)(Math.random() * lNameList.size());
            int cRand = (int)(Math.random() * classes.size());

            Student student = new Student(i);
            student.setFirstName(fNameList.get(fRand));
            student.setLastName(lNameList.get(lRand));
            student.setCurrentClass(classes.get(cRand));
            mockData.getStudents().add(student);
        }
    }

    public void overviewOnAction(ActionEvent actionEvent) throws IOException {
        System.out.println("penis");
//        Parent root;
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("/GUI/View/AddRemoveMovie.fxml"));
//        root = loader.load();
//        Stage stage = new Stage();
//        stage.setTitle("Add/Remove Movie");
//        stage.setScene(new Scene(root));
//        stage.show();
    }

    public void oneStudentOnAction(ActionEvent actionEvent) {
        
    }

    public void handleCheckButton(ActionEvent event) throws IOException {
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/attendance/gui/view/CheckStudentAttendance.fxml"));
        root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Add/Remove Movie");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
