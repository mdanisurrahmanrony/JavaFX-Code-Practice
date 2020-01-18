package buildGuiJavaFxBasic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class BuildGUI4 extends Application{
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        HBox vbox = new HBox();
        
        vbox.setMinHeight(500);
        vbox.setMinWidth(700);
//        vbox.setAlignment(Pos.CENTER);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setSpacing(20);
        
        TextField textfield = new TextField();
        textfield.setMaxWidth(300);
        textfield.setAlignment(Pos.CENTER);
        
        Button button = new Button("Click");
        
//        button.setText("Click");

        vbox.getChildren().addAll(textfield,button);
        
        Scene scene = new Scene(vbox);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
