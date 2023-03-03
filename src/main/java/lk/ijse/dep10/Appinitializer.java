package lk.ijse.dep10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL fxmlFile=getClass().getResource("/view/View.fxml");
        FXMLLoader fileLoader=new FXMLLoader(fxmlFile);
        AnchorPane root= fileLoader.load();
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DrawYou");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
}
