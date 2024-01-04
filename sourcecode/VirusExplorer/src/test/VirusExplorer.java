package test;

import controller.MainScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import virus.VirusList;
import virus.VirusWithEnvelope;
import virus.VirusWithoutEnvelope;

import java.nio.file.Path;
import java.nio.file.Paths;

public class VirusExplorer extends Application {
    public static VirusList virusList;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String MAIN_SCREEN_FXML = "/view/MainScreen.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(MAIN_SCREEN_FXML));
        MainScreenController mainScreenController = new MainScreenController(virusList);
        fxmlLoader.setController(mainScreenController);

        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Virus Explorer");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        Path currentPath = Paths.get("");
        System.out.println(currentPath);
        virusList = new VirusList();

        launch(args);
    }
}
