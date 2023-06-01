package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class OrderController implements Initializable{

    @FXML
    Label price1, price2, price3, item1, item2, item3, qty1, qty2, qty3, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        item1.setText(HomeController.blamp.getProductName());
        price1.setText(Double.toString(HomeController.blamp.getProductPrice()));

        item2.setText(HomeController.clamp.getProductName());
        price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
       
        item3.setText(HomeController.wlamp.getProductName());
        price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));


    
}
}


