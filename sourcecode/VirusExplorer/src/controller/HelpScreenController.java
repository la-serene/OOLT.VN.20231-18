package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class HelpScreenController {
    @FXML
    private TextArea taAbout;
    public void setAbout() {
        taAbout.setText("This is a guide on application use.");
    }
}
