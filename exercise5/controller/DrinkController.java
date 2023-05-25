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
    

    Coke coke = new Coke();
    Gin gin = new Gin();
    Redhorse redhorse = new Redhorse();
    Infinitea infinitea = new Infinitea();
    Sanmig sanmig = new Sanmig();

    public void initialize() {

        coke.setColor("Black");
        coke.setTaste("Very Sweet");

        gin.setColor("Transparent");
        gin.setTaste("bitter");

        infinitea.setColor("Brown");
        infinitea.setTaste("Sweet");

        redhorse.setColor("Orange");
        redhorse.setTaste("Strong");

        sanmig.setColor("Orange");
        sanmig.setTaste("bitter");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Cokes are " + coke.getColor() + " and " + coke.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Gin are " + gin.getColor() + " and " + gin.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Infinitea are " + infinitea.getColor() + " and " + infinitea.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Redhorse are " + redhorse.getColor() + " and " + redhorse.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Sanmig are " + sanmig.getColor() + " and " + sanmig.getTaste());
        }

        alert.showAndWait();

    }
}
