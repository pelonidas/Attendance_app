package com.attendance.gui.model;

import com.attendance.be.Student;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MockData {
    private final ObservableList<Student> students = FXCollections.observableArrayList();

    public ObservableList<Student> getStudents() {
        return students;
    }
}
