/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<String> listView;

    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    private TextField textField;
    @FXML
    private Label label;

    String selectedItem;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        list.add("Apple");
        list.add("Orange");
        list.add("Lichi");
        list.add("Jack-Fruit");

        listView.setItems(list);
    }

    @FXML
    private void addButtonAction(ActionEvent event) {

        String str = textField.getText();

        if (str.equals("")) {
            return;
        }

        list.add(str);

        textField.clear();

    }

    ObservableList<String> selectedItems = FXCollections.observableArrayList();
    

    @FXML
    private void listViewMouseClickedAction(MouseEvent event) {

        selectedItem = listView.getSelectionModel().getSelectedItem();

        selectedItems = listView.getSelectionModel().getSelectedItems();

        String str = "";

        for (String item : selectedItems) {

            str += item + "\n";

        }

        label.setText(str);
    }

    @FXML
    private void deleteButtonAction(ActionEvent event) {

        list.removeAll(selectedItems);

    }

}
