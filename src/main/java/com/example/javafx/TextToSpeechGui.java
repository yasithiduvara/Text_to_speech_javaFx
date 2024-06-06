package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TextToSpeechGui extends Application {
    private static final int APP_WIDTH = 375;
    private static final int APP_HIGHT = 475;
    private TextArea textArea;


    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = createScene();
        scene.getStylesheets().add(getClass().getResource(
                "style.css"
        ).toExternalForm());
        stage.setTitle("Text Speech App!");
        stage.setScene(scene);
        stage.show();
    }

    private Scene createScene(){
        VBox box = new VBox();
        box.getStyleClass().add("body");

        Label textToSpeechLabel = new Label("Text-to-Speech");
        box.getStyleClass().add("textToSpeechLabel");

        textToSpeechLabel.setMaxWidth(Double.MAX_VALUE);
        textToSpeechLabel.setAlignment(Pos.CENTER);
        box.getChildren().add(textToSpeechLabel);

        textArea = new TextArea();
        box.getChildren().add(textArea);

        return new Scene(box, APP_WIDTH, APP_HIGHT);
    }


    public static void main(String[] args) {
        launch();
    }
}