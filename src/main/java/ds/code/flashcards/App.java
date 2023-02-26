package ds.code.flashcards;

import ds.code.flashcards.controller.CardStackController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    private Stage stage;
    private VBox vBox;
    private AnchorPane flashcardsOverview;

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

//    @Override
//    public void stop() {
//        Database.closeConnection();
//    }

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
            loader.setLocation(App.class.getResource("/ds.code.flashcards/fxml/FlashcardsOverview.fxml"));

            flashcardsOverview = (AnchorPane) loader.load();

            flashcardsOverview.setCenterShape(true);
            CardStackController cardStackController = loader.getController();
            cardStackController.setApp(this);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }



}
