package com.example.virusexplorer.controller;

import com.example.virusexplorer.test.da;
import com.example.virusexplorer.virus.VirusList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainScreenController {
    private final VirusList virusList;
    @FXML
    public Button btnHelp;
    @FXML
    public Button btnQuit;
    @FXML
    public GridPane gridPane;
    public MainScreenController(VirusList virusList) {
        this.virusList = virusList;
    }
    @FXML
    public void initialize() {
            int column = 0;
            int row = 1;

            for (int i = 0; i < virusList.listOfVirus.size(); i++) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(da.class.getResource("VirusItem.fxml"));
                    Parent root = fxmlLoader.load();

                    fxmlLoader.setLocation(da.class.getResource("VirusItem.fxml"));

                    VirusItemController virusItemController = new VirusItemController(virusList);

                    AnchorPane anchorPane = fxmlLoader.load();

                    virusItemController.setData(virusList.listOfVirus.get(i));

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
    public void btnHelpClicked(ActionEvent e) {

    }

    public void btnQuitClicked(ActionEvent e) {

    }
}
