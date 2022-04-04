package com.example.assignment2gc200479031;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

     @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search-book-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search Book Database by Title");
         stage.getIcons().add(new Image("file:book-icon.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        // ApiResponse apiResponse = APIUtility.getBooksFromJSONFile("javaApiFetched.json");

       // System.out.println(apiResponse);

        // //ApiResponse apiResponse = APIUtility.getBooksFromOMDB("To kill the mockingbird");

        //for(Book book : apiResponse.getItems()) {

        // System.out.println(book.getBookDetail().getTitle());
        //}
    }
}