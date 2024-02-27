package com.grey.dice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class DiceController implements Initializable
{

    @FXML
    private Button btnThrow;
    @FXML
    private Label lblNumber;

    Random rand = new Random();
    public void initialize(URL url, ResourceBundle rb)
    {
        lblNumber.setText("0");
    }
    @FXML
    public void generateRandomNumber(ActionEvent actionEvent)
    {
        Integer number = rand.nextInt(1,7);
        lblNumber.setText(number.toString());
    }
}