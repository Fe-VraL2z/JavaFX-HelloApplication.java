package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


import java.io.IOException;

public class HelloController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("hello-view.fxml"));
        VBox root = loader.load();

        Scene scene = new Scene(root, 400, 600);
        String css = getClass().getResource("styles/app.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Hola FX + CSS");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
    //identificar la etiqueta que va a cambiar
}