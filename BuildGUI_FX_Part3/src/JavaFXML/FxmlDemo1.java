package JavaFXML;

import java.awt.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class FxmlDemo1 extends Application{
    
    
    public static void main(String[] args) {
        
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent pane = FXMLLoader.load(FxmlDemo1.class.getResource("FXML.fxml"));
        
        
        Scene scene = new Scene(pane);
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
}
