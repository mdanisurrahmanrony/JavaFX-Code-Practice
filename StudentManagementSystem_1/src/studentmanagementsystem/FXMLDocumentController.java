/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private VBox mainContent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO

            Parent pane = FXMLLoader.load(getClass().getResource("AddStudentLayout.fxml"));
            mainContent.getChildren().setAll(pane);

        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void addStudent(ActionEvent event) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource("AddStudentLayout.fxml"));
        mainContent.getChildren().setAll(pane);

    }

    @FXML
    private void showAllStudeents(ActionEvent event) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource("AllStudentShow.fxml"));
        mainContent.getChildren().setAll(pane);

    }

}
