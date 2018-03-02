package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.awt.*;

public class MenuController {

    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    Float data = 0f;
    int operation = 1;

    @FXML
    Button one;

    @FXML
    Button two;

    @FXML
    Button three;

    @FXML
    Button four;

    @FXML
    Button five;

    @FXML
    Button six;

    @FXML
    Button seven;

    @FXML
    Button eight;

    @FXML
    Button nine;

    @FXML
    Button zero;

    @FXML
    Button plus;

    @FXML
    Button mult;

    @FXML
    Button div;

    @FXML
    Button clear;

    @FXML
    Button minus;

    @FXML
    Button equals;

    @FXML
    TextField display;


    public void handleButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one) {
            display.setText(display.getText() + "1");

        } else if (actionEvent.getSource() == two) {
            display.setText(display.getText() + "2");

        } else if (actionEvent.getSource() == three) {
            display.setText(display.getText() + "3");

        } else if (actionEvent.getSource() == four) {
            display.setText(display.getText() + "4");

        } else if (actionEvent.getSource() == five) {
            display.setText(display.getText() + "5");

        } else if (actionEvent.getSource() == six) {
            display.setText(display.getText() + "6");

        } else if (actionEvent.getSource() == seven) {
            display.setText(display.getText() + "7");

        } else if (actionEvent.getSource() == eight) {
            display.setText(display.getText() + "8");

        } else if (actionEvent.getSource() == nine) {
            display.setText(display.getText() + "9");

        } else if (actionEvent.getSource() == zero) {
            display.setText(display.getText() + "10");

        } else if (actionEvent.getSource() == clear) {
            display.setText(" ");

        } else if (actionEvent.getSource() == plus) {
            data = Float.parseFloat(display.getText());
            operation = 1; // Dodawanie
            display.setText("");

        } else if (actionEvent.getSource() == minus) {
            data = Float.parseFloat(display.getText());
            operation = 2; // Odejmowanie
            display.setText("");

        } else if (actionEvent.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 3; // Dzielenie
            display.setText("");

        } else if (actionEvent.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            operation = 4;  // Mnożenie
            display.setText("");

        } else if (actionEvent.getSource() == equals) {

            Float secondOperand = Float.parseFloat(display.getText());
            switch (operation)
            {
                case 1: //Dodawanie
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 2: //Odejmowanie
                     ans = data - secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 3: //Mnożenie
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));break;

                case 4: //Dzielenie

                    ans = 0f;
                    try {
                            ans = data / secondOperand;
                        }catch (Exception e) {display.setText("Error");}

                        display.setText(String.valueOf(ans));break;


            }


        }




















    }

}



















