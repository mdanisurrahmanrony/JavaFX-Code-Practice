/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField display;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    String operator = "";
    double num1 = 0;

    boolean start = true;

    @FXML
    private void numberButtonAction(ActionEvent event) {

        if (start == true) {

            display.setText("");
            start = false;

        }

        String oldText = display.getText();

        String newText = ((Button) event.getSource()).getText();

        String number = oldText + newText;

        display.setText(number);

    }

    @FXML
    private void AllClearAction(ActionEvent event) {

        display.setText("");
        start = true;

    }

    @FXML
    private void operatorsAction(ActionEvent event) {

        num1 = Double.parseDouble(display.getText());
        operator = ((Button) event.getSource()).getText();
        display.setText("");

    }

    @FXML
    private void dotButtonAction(ActionEvent event) {

        String oldText = display.getText();

        if (oldText.contains(".")) {
            return;   //here return means kisui korbe na
        }
        display.setText(oldText + ".");

    }

    @FXML
    private void percentageButtonAction(ActionEvent event) {
    }

    @FXML
    private void offButtonAction(ActionEvent event) {
        
        System.exit(1);     // application/system exit hoye jabe
        
    }

    @FXML
    private void resultButtonAction(ActionEvent event) {

        double num2 = Double.parseDouble(display.getText());

        if (operator.equals("+")) {

            display.setText("" + (num1 + num2));
        } else if (operator.equals("-")) {

            display.setText("" + (num1 - num2));
        } else if (operator.equals("X")) {

            display.setText("" + (num1 * num2));
        } else if (operator.equals("/")) {

            if (num2 == 0) {
                display.setText("Invalid Input");
            }
            display.setText("" + (num1 / num2));
        }
        
        start = true;

    }

    @FXML
    private void clearAction(ActionEvent event) {

        String oldText = display.getText();
        if (!oldText.equals("")) {
            String subStr = oldText.substring(0, (oldText.length() - 1));       //making substring of oldText whose length is (oldText-1)

            display.setText(subStr);
        }

    }

}
