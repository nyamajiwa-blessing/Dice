package com.grey.dice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Dice extends Application {
    @Override
    public void start(Stage mainWindow) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Dice.class.getResource("main-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        mainWindow.setTitle("Dice Simulator");
        mainWindow.setScene(scene);
        mainWindow.setResizable(false);
        mainWindow.centerOnScreen();
        mainWindow.show();
    }

    public static void main(String[] args) {
        launch();
    }
}