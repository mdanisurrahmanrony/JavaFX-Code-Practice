package MultipleStage;

import MultipleScene.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleStage extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        vbox.setMinHeight(500);
        vbox.setMinWidth(700);

        Button btn = new Button("Click here");
        vbox.getChildren().addAll(btn);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                DialogBox box = new DialogBox();
                primaryStage.close();

            }
        });

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
