/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AllStudentShowController implements Initializable {

    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> emailColumn;
    @FXML
    private TableColumn<Student, String> departmentColumn;
    @FXML
    private TableColumn<Student, String> addressColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("email"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("department"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<Student,String>("address"));
        
        studentTable.setItems(AddStudentLayoutController.stdList);
        
    }    
    
}
