/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplescene;

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
import javafx.scene.layout.BorderPane;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private BorderPane mainContent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO

            Parent pane = FXMLLoader.load(getClass().getResource("first.fxml"));
            mainContent.setCenter(pane);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void firstButtonAction(ActionEvent event) throws IOException {

        Parent pane = FXMLLoader.load(getClass().getResource("secondContent.fxml"));
        mainContent.setCenter(pane);

    }

    @FXML
    private void secondButtonAction(ActionEvent event) throws IOException {
        
        Parent pane = FXMLLoader.load(getClass().getResource("first.fxml"));
        mainContent.setCenter(pane);
        
    }

    private Parent FXMLLoader(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
