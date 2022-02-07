package com.attendance.gui.controller;


import com.attendance.be.Student;
import com.attendance.gui.model.MockData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.text.TabableView;
import java.net.URL;
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
        System.out.println(mockData.getStudents());
        setupTableView();
    }

    private void setupTableView() {
        studentsTableView.setItems(mockData.getStudents());
        fNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        classColumn.setCellValueFactory(new PropertyValueFactory<>("currentClass"));
    }
    private void setupData() {
        Student student1 = new Student(1);
        student1.setFirstName("jozef");
        student1.setLastName("Matus");
        student1.setCurrentClass("kokot");
        for (int i = 0; i < 50; i++) {
            Student student = new Student(i);
            student.setFirstName("John" + i);
            student.setLastName("Doe" + i);
            student.setCurrentClass("class no." + i);
            mockData.getStudents().add(student);
        }
        mockData.getStudents().add(student1);
    }
}
