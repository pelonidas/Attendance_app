package com.attendance.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {

    private int id;
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty currentClass;

    public Student(int id, StringProperty fName, StringProperty lName, StringProperty currentClass) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.currentClass = currentClass;
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

    // ID
    public int getId() {
        return id;
    }
}
