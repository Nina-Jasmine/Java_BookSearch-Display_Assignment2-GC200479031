package com.example.assignment2gc200479031;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;


public class APIUtility {
    /**
     * This method will read the file and parse out the JSON objects into Java objects
     */
    public static ApiResponse getBooksFromJSONFile(String fileName) {
        //create a GSON object to parse the objects
        Gson gson = new Gson();
        ApiResponse apiResponse = null;

        //try with resources - anything inside the () will "auto close"
        try (
                //open the json file from the harddrive
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            //converting the JSON objects into an ApiResponse object
            apiResponse = gson.fromJson(jsonReader, ApiResponse.class);

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println(apiResponse);
        return apiResponse;
    }

    /**
     * This method will call the OMDB API and write to a file
     */
    public static ApiResponse getBooksFromOMDB(String searchTerm) {
        searchTerm = searchTerm.replace(" ", "%20");

        String uri = "https://www.googleapis.com/books/v1/volumes?q=search+intitle:" + searchTerm + "&key=AIzaSyDp_DizcmNRarGlfaAs-0KDe2qDSiGC-s0";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            //this will call the API and write the result to the file "javaApiFeteched.json"
            HttpResponse<Path> response = client.send(httpRequest, HttpResponse
                    .BodyHandlers
                    .ofFile(Paths.get("javaApiFetched.json")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return getBooksFromJSONFile("javaApiFetched.json");
    }

}
