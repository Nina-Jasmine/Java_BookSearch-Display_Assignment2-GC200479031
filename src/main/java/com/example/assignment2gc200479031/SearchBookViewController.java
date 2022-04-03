package com.example.assignment2gc200479031;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SearchBookViewController implements Initializable {

    @FXML
    private Button getDetailButton;

    @FXML
    private Label msgLabel;

    //@FXML
   // private Button searchButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<BookDetail> resultListView;

    @FXML
    private void searchBooks()
    {
        ApiResponse apiResponse = APIUtility.getBooksFromOMDB(searchTextField.getText());
        resultListView.getItems().clear();
        if (apiResponse.getItems() != null)
        {
            //BookDetail is about book information, which is nested in ApiResponse->Book->BookDetail
            ArrayList<BookDetail> bookDetails = new ArrayList<>();
            for(Book book : apiResponse.getItems()) {

                bookDetails.add(book.getBookDetail());
            }
             resultListView.getItems().addAll(bookDetails);
            msgLabel.setText("");
        }
        else
            msgLabel.setText("Book not found");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        getDetailButton.setVisible(false);
        msgLabel.setText("");

        resultListView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldBookSelected, newBookSelected) -> {
                    getDetailButton.setVisible(true);
                });
    }

    /**
     * This method will pass the id information to the Book details controller
     */
    @FXML
    private void getDetails(ActionEvent event) throws IOException {
        String id = resultListView.getSelectionModel().getSelectedItem().getBook().getId();
        System.out.println("Book ID: "+ id);
        SceneChanger.changeScenes(event, "book-details.fxml",id);
    }
}


