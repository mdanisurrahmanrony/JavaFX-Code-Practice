package CheckBox;

import buildGuiJavaFxBasic.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxx extends Application {

    public static void main(String[] args) {

        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox hbox = new HBox();
        hbox.setMinHeight(300);
        hbox.setMinWidth(300);

        VBox vbox1 = new VBox();
        vbox1.setMinWidth(200);
        VBox vbox2 = new VBox();
        vbox2.setMinWidth(200);

        Label lbl1 = new Label("All fruits");
        Label lbl2 = new Label("Selected fruits");

        CheckBox cbx1 = new CheckBox("Apple");
        CheckBox cbx2 = new CheckBox("Orange");
        CheckBox cbx3 = new CheckBox("Banana");
        CheckBox cbx4 = new CheckBox("Lichi");

        vbox1.getChildren().addAll(lbl1, cbx1, cbx2, cbx3, cbx4);
        vbox2.getChildren().addAll(lbl2);

        cbx1.setOnAction(e -> checkBoxAction(cbx1, vbox1, vbox2));
        cbx2.setOnAction(e -> checkBoxAction(cbx2, vbox1, vbox2));
        cbx3.setOnAction(e -> checkBoxAction(cbx3, vbox1, vbox2));
        cbx4.setOnAction(e -> checkBoxAction(cbx4, vbox1, vbox2));

        hbox.getChildren().addAll(vbox1, vbox2);

        Scene scene = new Scene(hbox);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    void checkBoxAction(CheckBox cbx, VBox vbox1, VBox vbox2) {

        if (cbx.isSelected()) {

            vbox2.getChildren().add(cbx);

        }
        
        else if(!cbx.isSelected()){
            
            vbox1.getChildren().add(cbx);
            
        }

    }

}
