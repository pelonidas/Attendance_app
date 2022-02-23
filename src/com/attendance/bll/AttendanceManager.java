package com.attendance.bll;

import com.attendance.be.Student;
import com.attendance.dal.StudentDAO;

import java.util.List;

public class AttendanceManager {
    StudentDAO studentDAO = new StudentDAO();

    public List<Student> getAllstudents() {
        return studentDAO.getAllStudents();
    }

    public List<String> getAllMonths() {
        return studentDAO.getAllMonths();
    }
}
