package com.attendance.dal;

import com.attendance.be.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAO {
    List<Student> studentsList;
    List<String> monthsList;


    public StudentDAO() {
        studentsList = new ArrayList<>();
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
            studentsList.add(student);

            monthsList = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");

        }
    }

    public List<Student> getAllStudents () {
        return studentsList;
    }

    public List<String> getAllMonths() {
        return monthsList;
    }
}