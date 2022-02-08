package com.attendance.gui.controller;

import com.attendance.gui.model.MockData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class TeacherGraphController implements Initializable {

    MockData model;

    @FXML
    private Button cancelBtn;

    @FXML
    private LineChart<String, Number> lineChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        model = new MockData();
        setChart();
    }

    private void setChart() {
        Random random = new Random();

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (int i = 0; i < 11; i++) {
            series.getData().add(new XYChart.Data<>(model.getMonths().get(i), random.nextInt(350)+150));

        }
        series.setName("year 2022");
        lineChart.getData().add(series);

    }

    public void toCancelScene(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }

} //TODO change responsivity of the button in the view of this controller
