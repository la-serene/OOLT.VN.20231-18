package com.example.virusexplorer.test;

import com.example.virusexplorer.virus.VirusList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class da extends Application {
    public static VirusList virusList;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(da.class.getResource("MainScreen.fxml"));

        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Virus Explorer");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        virusList = new VirusList();

        launch(args);
    }
}
