package com.attendance.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class TeacherOverviewController implements Initializable {
    @FXML
    private BarChart<String, Number> barChar;
    @FXML
    public CategoryAxis xAxis;

    //private ObservableList<String> monthStudent = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setBarChar();
    }

    public void setBarChar(){
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Students");


        Axis<Number> yAxis = barChar.getYAxis();
        yAxis.setLabel("Missing Days");

        for (String student: studentsToChart()){
            Random random = new Random();
            System.out.println(random.nextInt(90) + 10);
            series.getData().add(new XYChart.Data<>(student, random.nextInt(90) + 10));
        }
        barChar.getData().add(series);
    }

    public static List<String> studentsToChart(){
        ArrayList<String> lNameList = new ArrayList<>();
        lNameList.add("Smith");
        lNameList.add("Williams");
        lNameList.add("Brown");
        lNameList.add("Jones");
        lNameList.add("Garcia");
        lNameList.add("Miller");
        lNameList.add("Davis");
        return lNameList;
    }
}


