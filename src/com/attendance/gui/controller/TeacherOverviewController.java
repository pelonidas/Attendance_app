package com.attendance.gui.controller;

import com.attendance.gui.model.MockData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class TeacherOverviewController implements Initializable {
    @FXML
    private BarChart<String, Number> barChar;
    @FXML
    private CategoryAxis xAxis;

    private MockData mockData;

    //private ObservableList<String> monthStudent = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mockData = new MockData();
        setBarChar();
    }

    public void setBarChar(){
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Students");


        Axis<Number> yAxis = barChar.getYAxis();
        yAxis.setLabel("Missing Days");

        for (int i = 0; i < studentListSize(); i++){
            Random random = new Random();
            System.out.println(random.nextInt(90) + 10);
            series.getData().add(new XYChart.Data<>(studentsLastNameToChart(i), random.nextInt(90) + 10));
        }
        barChar.getData().add(series);
    }

    public String studentsLastNameToChart(int student){
        return mockData.getStudents().get(student).getLastName();
    }

    public int studentListSize(){
        return mockData.getStudents().size();
    }


}


