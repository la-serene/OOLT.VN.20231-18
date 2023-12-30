package controller;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import virus.Virus;

public class InspectInfectionController {
    @FXML
    public MediaView inspect_infection;
    public void setVideo(Virus virus) {
        Media media = new Media(virus.INFECTION_MECHANISM_PATH);
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        inspect_infection.setMediaPlayer(mediaPlayer);
    }
}
