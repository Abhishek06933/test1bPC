package com.example.test1b_pc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("TEST1B-ABHISHEK"); // Update the title
        stage.setScene(scene);

        // Set the controller for the FXML file
        HelloController controller = fxmlLoader.getController();
        fxmlLoader.setController(controller);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
