package com.attendance.gui.model;

import com.attendance.be.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Arrays;
import java.util.List;

public class MockData {
    private final ObservableList<Student> students = FXCollections.observableArrayList();
    private ObservableList<String> months;


    public MockData() {
        setMockData();
    }

    private void setMockData() {
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
            students.add(student);
        }
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

    public ObservableList<String> getMonths(){
        List<String> monthsList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months = FXCollections.observableArrayList();
        months.setAll(monthsList);
        return months;
    }
}
