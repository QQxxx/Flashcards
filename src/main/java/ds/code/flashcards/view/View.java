package ds.code.flashcards.view;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class View {

    private Stage primaryStage;
    private BorderPane rootStage;

    public void adjustOverview() {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Witty cards");

        // Add the icon.
        this.primaryStage.getIcons().add(new Image("")); // TODO add image
    }




    // In order to get a reference to the primary Stage, we need to create static fields.
    // We also need to create getter and setter methods.



    private ObservableList<SimpleStringProperty> flashcardList = FXCollections.observableArrayList();

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<SimpleStringProperty> getFlashcardList() {
        return flashcardList;
    }

    public void setFlashcardList(ObservableList<SimpleStringProperty> list) {
        flashcardList = list;
    }



//    public void initializeRootStage() throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getResource("view/RootStage.fxml"));
//
//        rootStage = (BorderPane) loader.load();
//        Scene scene = new Scene(rootStage);
//        primaryStage.setScene(scene);
//
//
//    }
//
//    public void showOverview() throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(Main.class.getResource(""));
//
//        AnchorPane overview = (AnchorPane) loader.load();
//        rootStage.setCenter(overview);
//    }
}
