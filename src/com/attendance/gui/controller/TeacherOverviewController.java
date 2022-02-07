package com.attendance.gui.controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;


public class TeacherOverviewController implements Initializable {
    @FXML
    private BarChart<String, Integer> barChar;
    @FXML
    public CategoryAxis xAxis;

    private ObservableList<String> monthStudent = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();

        series.getData().add(new XYChart.Data<>("January", 5));
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

        barChar.getData().addAll(series);
    }
}


