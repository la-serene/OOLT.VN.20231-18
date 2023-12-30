package test;

import virus.VirusList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VirusExplorer extends Application {
    public static VirusList virusList;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String MAIN_SCREEN_FXML = "/view/MainScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_SCREEN_FXML));

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
