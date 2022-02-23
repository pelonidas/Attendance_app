package com.attendance.gui.controller;

import com.attendance.gui.model.MockData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class TeacherOverviewController implements Initializable {
    @FXML
    private BarChart<String, Number> barChar;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private Button cancelBtn;

    private MockData mockData;


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

    @FXML
    void toCancelScene(ActionEvent event) {
        Stage stage = (Stage) cancelBtn.getScene().getWindow();
        stage.close();
    }


}


