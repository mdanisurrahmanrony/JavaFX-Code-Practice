package buildGuiJavaFxBasic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class BuildGUI7 extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox vbox = new VBox();
        
        vbox.setMinHeight(500);
        vbox.setMinWidth(700);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(20);
        
        Label label = new Label();
        
        TextField textfield = new TextField();
        textfield.setMaxWidth(300);
        textfield.setAlignment(Pos.CENTER);
        
        Button button = new Button("Submit");
        
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                
                String str = textfield.getText();
                label.setText("Hello! You typed : "+str);
                
            }            
            
        });
        
        vbox.getChildren().addAll(textfield,button,label);
        
        Scene scene = new Scene(vbox);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
