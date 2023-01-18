package ds.code.flashcards;

import ds.code.flashcards.controller.StageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ds.code.flashcards.model.Database;
import java.io.IOException;
import java.net.URL;


public class App extends Application {

    private Stage stage;
    private VBox vBox;

    public static void main(String args[]) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        this.stage = stage;
        this.stage.setTitle("Witty cards!");
        this.stage.getIcons().add(new Image("/ds.code.flashcards/images/logo_DS.png"));
        initializeStage();
        prepareCardsOverview();
    }

    @Override
    public void stop() {
        Database.closeConnection();
    }

    public void initializeStage() {
        try {
            FXMLLoader loader = new FXMLLoader();

            vBox = (VBox) loader.load(getClass().getResource("/ds.code.flashcards/fxml/MainScene.fxml"));
            Scene scene = new Scene(vBox);
            stage.setScene(scene);



            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
    }

    public void prepareCardsOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
        } catch () {

        }
    }

}
