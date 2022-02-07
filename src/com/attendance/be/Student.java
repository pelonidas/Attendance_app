package com.attendance.be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private int id;
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty currentClass;
    private IntegerProperty missedDays;

    public Student(int id) {
        this.id = id;
    }

    // FIRST NAME
    public StringProperty firstNameProperty() {
        if (firstName == null) firstName = new SimpleStringProperty(this, "firstName");
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstNameProperty().set(firstName);
    }

    public String getFirstName() {
        return firstNameProperty().get();
    }

    // LAST NAME
    public StringProperty lastNameProperty() {
        if (lastName == null) lastName = new SimpleStringProperty(this, "lastName");
        return lastName;
    }

    public void setLastName(String lastName) {
        lastNameProperty().set(lastName);
    }

    public String getLastName() {
        return lastNameProperty().get();
    }

    //CURRENT CLASS
    public StringProperty currentClassProperty() {
        if (currentClass == null) currentClass = new SimpleStringProperty(this, "currentClass");
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        currentClassProperty().set(currentClass);
    }

    public String getCurrentClass() {
        return currentClassProperty().get();
    }

    //MISSED DAY
    public IntegerProperty missedDaysProperty() {
        if (missedDays == null) missedDays = new SimpleIntegerProperty(this, "missedDays");
        return missedDays;
    }

    public void setMissedDays(int missedDays){
        missedDaysProperty().set(missedDays);
    }

    public int getMissedDays(){
        return missedDaysProperty().get();
    }

    // ID
    public int getId() {
        return id;
    }
}
