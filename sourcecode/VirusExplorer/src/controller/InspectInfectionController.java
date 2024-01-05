package controller;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import virus.Virus;

public class InspectInfectionController {
    @FXML
    public MediaView inspect_infection;
    public Virus virus;

    public InspectInfectionController(Virus virus) {
        this.virus = virus;
    }

    public void setVideo() {
        String currentPath = System.getProperty("user.dir").replace("\\", "/");
        String absoluteVideoPath = "file:///" + currentPath + "/src" + virus.INFECTION_MECHANISM_PATH;

        Media media = new Media(absoluteVideoPath);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        inspect_infection.setMediaPlayer(mediaPlayer);

        mediaPlayer.setAutoPlay(true);
        System.out.println();
    }}
