package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelpScreenController {
    @FXML
    private TextArea taAbout;
    public void setAbout() {
        try {
            String HELP_PATH = "/assets/help/user_guide.txt";

            String currentPath = System.getProperty("user.dir");
            HELP_PATH = currentPath + "/src/" + HELP_PATH;

            String content = new String(Files.readAllBytes(Paths.get(HELP_PATH)));
            taAbout.setText(content);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
