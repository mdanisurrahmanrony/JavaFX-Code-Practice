/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AddStudentLayoutController implements Initializable {

    @FXML
    private TextField studentName;
    @FXML
    private TextField studentEmail;
    @FXML
    private TextField department;
    @FXML
    private TextArea address;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    static ObservableList<Student> stdList = FXCollections.observableArrayList();       //static korate ei object ekhon class er under e chole gelo. that means ekhon ei class er madhdhome onno class thekeo eke access kora jabe

    @FXML
    private void saveButtonAction(ActionEvent event) throws IOException {
        
        String name = studentName.getText();
        String email = studentEmail.getText();
        String dept = department.getText();
        String adr = address.getText();
        
        if(name.equals("") && email.equals("") && dept.equals("") && adr.equals("")) return;
        
        File file = new File("data.txt");
        if(!file.exists()) file.createNewFile();
        
        FileWriter fileWriter = new FileWriter(file,true);      //true dile ager data thakbe ebong tar shathe notun data add hobe. true na dile by default ager shob data muse diye notun kore likhbe.
        fileWriter.write(name+"#"+email+"#"+dept+"#"+adr+"\n");
        fileWriter.close();
        
        Student std = new Student(name, email, dept, adr);        
        
        studentName.clear();      //every field make clear
        studentEmail.clear();      //every field make clear
        department.clear();      //every field make clear
        address.clear();      //every field make clear
        
    }

    @FXML
    private void resetButtonAction(ActionEvent event) {
    }
    
}
