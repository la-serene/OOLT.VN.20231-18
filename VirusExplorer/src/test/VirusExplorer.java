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
        virusList = new VirusList();
        VirusWithEnvelope v1 = new VirusWithEnvelope("HIV", "", "");
        VirusWithEnvelope v2 = new VirusWithEnvelope("Ada", "", "");
        VirusWithoutEnvelope v3 = new VirusWithoutEnvelope("Adasda", "", "");

        virusList.addVirus(v1);
        virusList.addVirus(v2);
        virusList.addVirus(v3);

        launch(args);
    }
}
