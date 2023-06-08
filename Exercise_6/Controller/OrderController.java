package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class OrderController implements Initializable {

    
    @FXML 
    Label item1, item2, item3;
    
    @FXML
    Label qty1, qty2, qty3;

    @FXML
    Label price1, price2, price3;
    
    @FXML
    Label totalLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if(HomeController.blamp.getProductStatus() == true){

            item1.setText(HomeController.blamp.getProductName());
            qty1.setText(String.valueOf(HomeController.blamp.getProductQuantity()));
            price1.setText(String.valueOf(HomeController.blamp.getProductPrice()));

        }

        else {

            item1.setVisible(false);
            qty1.setVisible(false);
            price1.setVisible(false);
            
        }
        if(HomeController.clamp.getProductStatus() == true){

            item2.setText(HomeController.clamp.getProductName());
            qty2.setText(String.valueOf(HomeController.clamp.getProductQuantity()));
            price2.setText(String.valueOf(HomeController.clamp.getProductPrice()));

        }
        else {

            item2.setVisible(false);
            qty2.setVisible(false);
            price2.setVisible(false);    

        }
        if(HomeController.wlamp.getProductStatus() == true){

            item3.setText(HomeController.wlamp.getProductName());
            qty3.setText(String.valueOf(HomeController.wlamp.getProductQuantity()));
            price3.setText(String.valueOf(HomeController.wlamp.getProductPrice()));

        }
        else {   
            qty3.setVisible(false);
            item3.setVisible(false);
            price3.setVisible(false);

        }

        totalLabel.setText(CheckoutController.TotalA);

    }

    }
    

