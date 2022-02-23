package com.attendance.gui.model;

import com.attendance.be.Student;
import com.attendance.bll.AttendanceManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MockData {
    private final ObservableList<Student> students = FXCollections.observableArrayList();
    private ObservableList<String> months;
    private AttendanceManager manager;

    public MockData() {
        manager = new AttendanceManager();
        students.setAll(manager.getAllstudents());
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

    public ObservableList<String> getMonths(){
        months = FXCollections.observableArrayList();
        months.setAll(manager.getAllMonths());
        return months;
    }
}
