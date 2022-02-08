package com.attendance.gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;

import java.net.URL;
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

        Axis<String> xAxis = barChar.getXAxis();
        xAxis.setLabel("Months");

        Axis<Number> yAxis = barChar.getYAxis();
        yAxis.setLabel("Missing Days");


        series.getData().add(new XYChart.Data<>("January", 54));
        series.getData().add(new XYChart.Data<>("February", 90));
        series.getData().add(new XYChart.Data<>("March", 22));
        series.getData().add(new XYChart.Data<>("April", 56));
        series.getData().add(new XYChart.Data<>("May", 3));
        series.getData().add(new XYChart.Data<>("June", 12));
        series.getData().add(new XYChart.Data<>("July", 23));
        series.getData().add(new XYChart.Data<>("August", 60));
        series.getData().add(new XYChart.Data<>("September ", 34));
        series.getData().add(new XYChart.Data<>("October ", 24));
        series.getData().add(new XYChart.Data<>("November ", 9));
        series.getData().add(new XYChart.Data<>("December", 19));

        barChar.getData().add(series);
    }
}


