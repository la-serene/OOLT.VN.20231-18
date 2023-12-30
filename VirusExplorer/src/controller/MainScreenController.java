package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import virus.Virus;
import virus.VirusList;
import virus.VirusWithEnvelope;
import virus.VirusWithoutEnvelope;

import java.io.IOException;
import java.util.ArrayList;

public class MainScreenController {
    private final VirusList virusList;
    private ArrayList<Virus> virusListToExplore = new ArrayList<>();
    @FXML
    public Button btnHelp;
    @FXML
    public Button btnQuit;
    @FXML
    public ScrollPane scrollPane_in_stack;
    @FXML
    public VBox vbox_in_stack;
    @FXML
    public Button btnEnvelope;
    @FXML
    public Button btnNoEnvelope;
    @FXML
    public GridPane gridPane;

    public MainScreenController(VirusList virusList) {
        this.virusList = virusList;
    }
    @FXML
    public void btnEnvelopeClicked(ActionEvent e) {
        for (Virus v : virusList.listOfVirus) {
            if (v instanceof VirusWithEnvelope) virusListToExplore.add(v);
        }

        vbox_in_stack.setVisible(false);
        scrollPane_in_stack.setVisible(true);
        gridPane.getChildren().clear();

        showVirusListToExplore();
    }

    @FXML
    public void btnNoEnvelopeClicked(ActionEvent e) {
        for (Virus v : virusList.listOfVirus) {
            if (v instanceof VirusWithoutEnvelope) virusListToExplore.add(v);
        }

        vbox_in_stack.setVisible(false);
        scrollPane_in_stack.setVisible(true);
        gridPane.getChildren().clear();

        showVirusListToExplore();
    }

    public void showVirusListToExplore() {
        final String ITEM_FXML = "/view/VirusItem.fxml";
        int column = 0;
        int row = 1;

        for (Virus virus : virusListToExplore) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource(ITEM_FXML));

                VirusItemController virusItemController = new VirusItemController(virus);
                fxmlLoader.setController(virusItemController);

                AnchorPane anchorPane = fxmlLoader.load();

                virusItemController.setData(virus);

                if (column == 3) {
                    column = 0;
                    row += 1;
                }

                gridPane.add(anchorPane, column++, row);
                GridPane.setMargin(anchorPane, new Insets(20, 10, 10, 10));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    public void btnReturnClicked(ActionEvent e) {
        if (!vbox_in_stack.isVisible()) {
            vbox_in_stack.setVisible(true);
            scrollPane_in_stack.setVisible(false);
            virusListToExplore = new ArrayList<>();
        }
    }

    public void btnHelpClicked(ActionEvent e) {
        try {
            final String INSPECT_INFECTION_FXML = "view/InspectInfection.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(INSPECT_INFECTION_FXML));
            InspectInfectionController inspectInfectionController = new InspectInfectionController();
            fxmlLoader.setController(inspectInfectionController);

            Parent root = fxmlLoader.load();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void btnQuitClicked(ActionEvent e) {
        Platform.exit();
    }
}
