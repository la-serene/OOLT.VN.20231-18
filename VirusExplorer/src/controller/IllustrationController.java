package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import virus.Virus;

public class IllustrationController {
    @FXML
    public ImageView virus_diagram;
    @FXML
    public TextArea taVirusDescription;
    public void setIllustration(Virus virus) {
        Image image = new Image(virus.ILLUSTRATION_PATH);
        virus_diagram.setImage(image);
        taVirusDescription.setText(virus.description);
    }
}
