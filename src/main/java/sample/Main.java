package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //        Scene scene = new Scene(parent, 500, 637);
        //        scene.getStylesheets().add("org/eu/sixlab/fxml/Style.css");
        //
        //        primaryStage.setScene(scene);

        //primaryStage 主要的舞台
        primaryStage.setTitle("Someing");
        primaryStage.setScene(new Scene(root, 600, 575));
//        primaryStage.set
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
