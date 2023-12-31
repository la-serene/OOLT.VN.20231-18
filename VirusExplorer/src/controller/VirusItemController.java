package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import virus.Virus;
import virus.VirusList;

import java.io.IOException;

public class VirusItemController {
    @FXML
    public TextField tfVirusName;
    public Virus virus;

    public VirusItemController(Virus virus) {
        this.virus = virus;
    }

    public void setData(Virus virus) {
        tfVirusName.setText(virus.name);
    }

    public void btnExamineVirusClicked(ActionEvent e) {
        try {
            final String ILLUSTRATION_FXML = "/view/Illustration.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(ILLUSTRATION_FXML));
            IllustrationController illustrationController = new IllustrationController(virus);

            fxmlLoader.setController(illustrationController);
            Parent root = fxmlLoader.load();

            illustrationController.setIllustration();

            Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Cart");
            stage.show();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void btnInspectInfectionClicked(ActionEvent e) {
        try {
            final String INSPECT_INFECTION_FXML = "view/InspectInfection.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(INSPECT_INFECTION_FXML));

            InspectInfectionController inspectInfectionController = new InspectInfectionController();
            fxmlLoader.setController(inspectInfectionController);

            Parent root = fxmlLoader.load();

            inspectInfectionController.setVideo(virus);


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
