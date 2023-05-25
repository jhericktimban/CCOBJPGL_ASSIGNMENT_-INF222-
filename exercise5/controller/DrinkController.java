package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;
    

    Sanmig sanmig = new Sanmig();
    Gin gin = new Gin();
    Smirnoff smirnoff = new Smirnoff();
    Soju soju = new Soju();
    Barpink barpink = new Barpink();

    public void initialize() {

        barpink.setColor("Pink");
        barpink.setTaste("Mahal ko pa sya!");

        gin.setColor("Transparent");
        gin.setTaste("Sya parin talaga </3");

        smirnoff.setColor("Orange");
        smirnoff.setTaste("Sweet");

        sanmig.setColor("Orange");
        sanmig.setTaste("Apple");

        soju.setColor("Transparent");
        soju.setTaste("Ako nalang kasi! :<");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("The Bar pink is color " + barpink.getColor() + " and taste like " + barpink.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Smirnoff is color " + smirnoff.getColor() + " and taste like " + smirnoff.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Kwatro Kantos is color " + gin.getColor() + " and taste like " + gin.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("San Miguel Apple is color " + sanmig.getColor() + " and taste like " + sanmig.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Soju is color " + soju.getColor() + " and taste like " + soju.getTaste());
        }

        alert.showAndWait();

    }
}