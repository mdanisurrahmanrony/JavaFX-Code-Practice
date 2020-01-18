/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> name;
    @FXML
    private TableColumn<Person, Integer> id;
    @FXML
    private TableColumn<Person, Double> salary;
    
    
    ObservableList<Person> list = FXCollections.observableArrayList(
            
            
            new Person("Rony",1,50000),
            new Person("Babul",2,60000),
            new Person("Ratul",3,70000),
            new Person("Sanjida",4,80000),
            new Person("Jui",5,90000)
    
    );
    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField salaryField;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);     //to make select multiple item
        
        name.setCellValueFactory(new PropertyValueFactory<Person,String>("name"));      //first name column er & second name holo Person class er kon property theke nibe
        id.setCellValueFactory(new PropertyValueFactory<Person,Integer>("id"));      //first id column er & second id holo Person class er kon property theke nibe
        salary.setCellValueFactory(new PropertyValueFactory<Person,Double>("salary"));      //first salary column er & second salary holo Person class er kon property theke nibe
        
        tableView.setItems(list);
        
    }    

    @FXML
    private void addPersonButtonAction(ActionEvent event) {
        
        if(nameField.getText().isEmpty()) return;
        if(idField.getText().isEmpty()) return;
        if(salaryField.getText().isEmpty()) return;
        
        String name = nameField.getText();
        int id =Integer.parseInt(idField.getText());
        double salary = Double.parseDouble(salaryField.getText());
        
//        Person  person = new Person(name,id,salary);
//        list.add(person);

        list.add(new Person(name,id,salary));
        
        nameField.clear();
        idField.clear();
        salaryField.clear();
    }

    @FXML
    private void deleteButtonAction(ActionEvent event) {
        
        Person person = tableView.getSelectionModel().getSelectedItem();       //for get selected item
        list.remove(person);
        
    }
    
}
