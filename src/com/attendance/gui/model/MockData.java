package com.attendance.gui.model;

import com.attendance.be.Student;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MockData {
    private ObservableList<Student> students = FXCollections.observableArrayList();

    private void setupData() {
        Student student1 = new Student(1, , "Pumpa", "Marketing");
    }
}
