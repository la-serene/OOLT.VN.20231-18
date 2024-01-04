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
        VirusWithEnvelope v1 = new VirusWithEnvelope("Ebola", "/assets/data/Enveloped_Virus/Ebola/EbolaVirus_diagram.jpg", "/assets/data/Enveloped_Virus/Ebola/EbolaVirus_infection(3D).mp4");
        VirusWithEnvelope v2 = new VirusWithEnvelope("Hepatitis C", "/assets/data/Enveloped_Virus/Hepatitis_C/HepatitisCVirus_diagram.jpg", "/assets/data/Enveloped_Virus/Hepatitis_C/HepatitisCVirus_infection.mp4");
        VirusWithEnvelope v3 = new VirusWithEnvelope("HIV", "/assets/data/Enveloped_Virus/HIV/HIV_diagram.png", "/assets/data/Enveloped_Virus/HIV/HIV_infection.mp4");
        VirusWithEnvelope v4 = new VirusWithEnvelope("HSV", "/assets/data/Enveloped_Virus/HSV/HerpesSimplexVirus_diagram.png", "/assets/data/Enveloped_Virus/HSV/HerpesSimplexVirus_infection.mp4");
        VirusWithEnvelope v5 = new VirusWithEnvelope("Influenza", "/assets/data/Enveloped_Virus/Influenza/InfluenzaVirus_diagram.png", "/assets/data/Enveloped_Virus/Influenza/InflluenzaVirus_infection.mp4");
        VirusWithEnvelope v6 = new VirusWithEnvelope("SARS-CoV-2", "/assets/data/Enveloped_Virus/SARS-CoV-2/SARS-CoV-2_diagram.png", "/assets/data/Enveloped_Virus/SARS-CoV-2/SARS-CoV-2_infection.mp4");
        VirusWithoutEnvelope v7 = new VirusWithoutEnvelope("Adenovirus", "/assets/data/Non-Enveloped_Virus/Adenovirus/AdenoVirus_diagram.png", "/assets/data/Non-Enveloped_Virus/Adenovirus/Adenovirus_infection.mp4");
        VirusWithoutEnvelope v8 = new VirusWithoutEnvelope("Norovirus", "/assets/data/Non-Enveloped_Virus/Norovirus/Norovirus_diagram.png", "/assets/data/Non-Enveloped_Virus/Norovirus/Norovirus_infection.mp4");
        VirusWithoutEnvelope v9 = new VirusWithoutEnvelope("Papillomavirus", "/assets/data/Non-Enveloped_Virus/Papillomavirus/Papillomavirus_diagram.png", "/assets/data/Non-Enveloped_Virus/Papillomavirus/Papillomavirus_infection.mp4");
        VirusWithoutEnvelope v10 = new VirusWithoutEnvelope("Rhinovirus", "/assets/data/Non-Enveloped_Virus/Rhinovirus/Rhinovirus_diagram.png", "/assets/data/Non-Enveloped_Virus/Rhinovirus/Rhinovirus_infection.mp4");
        VirusWithoutEnvelope v11 = new VirusWithoutEnvelope("Rotavirus", "/assets/data/Non-Enveloped_Virus/Rotavirus/Rotavirus_diagram.png", "/assets/data/Non-Enveloped_Virus/Rotavirus/Rotavirus_infection.mp4");

        virusList.addVirus(v1);
        virusList.addVirus(v2);
        virusList.addVirus(v3);
        virusList.addVirus(v4);
        virusList.addVirus(v5);
        virusList.addVirus(v6);
        virusList.addVirus(v7);
        virusList.addVirus(v8);
        virusList.addVirus(v9);
        virusList.addVirus(v10);
        virusList.addVirus(v11);

        launch(args);
    }
}
