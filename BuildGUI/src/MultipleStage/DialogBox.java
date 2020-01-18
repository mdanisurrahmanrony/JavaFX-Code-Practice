package MultipleStage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class DialogBox extends Stage{

    public DialogBox() {
        
        VBox vbox = new VBox();
        vbox.setMinHeight(600);
        vbox.setMinWidth(800);
        
        Label lbl = new Label("This is second stage");
        
        vbox.getChildren().add(lbl);
        
        Scene scene = new Scene(vbox);
        
        Stage stage = new Stage();
        
        stage.setScene(scene);
        stage.show();
        
    }
    
        
}
