package com.attendance.gui.model;

import com.attendance.be.Student;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MockData {
    private final ObservableList<Student> students = FXCollections.observableArrayList();
    private ObservableList<String> months = FXCollections.observableArrayList();;


    public MockData() {
        setData();
    }

    private void setData() {
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
            students.add(student);
        }
    }

    public ObservableList<Student> getStudents() {
        return students;
    }

    public ObservableList<String> getMonths(){
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("Jule");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        return months;
    }
}
