package com.example.assignment2gc200479031;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main  {

   /* @Override       extends Application
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

    public static void main(String[] args) {
       // launch();
        //ApiResponse apiResponse = APIUtility.getBooksFromJSONFile("apiResponse.json");

        ApiResponse apiResponse = APIUtility.getBooksFromOMDB("The great Gatsby");

        for(Book book : apiResponse.getItems()) {

        System.out.println(book.getVolumeInfo().getTitle());
        }
    }
}