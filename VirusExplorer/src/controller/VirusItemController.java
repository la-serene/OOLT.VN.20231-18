package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import virus.Virus;
import virus.VirusList;

public class VirusItemController {
    public final VirusList listOfVirus;
    @FXML
    public TextField tfVirusName;

    public VirusItemController(VirusList listOfVirus) {
        this.listOfVirus = listOfVirus;
    }

    public void setData(Virus virus) {
        tfVirusName.setText(virus.name);
    }

    public void btnExamineVirusClicked(ActionEvent e) {

    }

    public void btnInspectInjectionClicked(ActionEvent e) {

    }
}
