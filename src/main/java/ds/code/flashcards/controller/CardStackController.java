package ds.code.flashcards.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import ds.code.flashcards.model.Card;

public class CardStackController {

    @FXML
    private TextField textFieldDeckName;

    @FXML
    private TextField textFieldFront;

    @FXML
    private TextField textFieldBack;

    @FXML
    private TableView<Card> cardTableView;

    @FXML
    private Button addCardBtn;

    @FXML
    private Button removeCardBtn;

    @FXML
    private Button cancelBtn;

    @FXML
    private Button addDeckBtn;



    /**
     *
     * @param mouseEvent
     * Checks if new card has been correctly filled in.
     * Adds the card to the set.
     */
    @FXML
    void addCard(MouseEvent mouseEvent) {

        if("".equals(textFieldFront.getText()) || "".equals(textFieldBack.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("Please fill in front and back sides of the card.");
            alert.setTitle("Card is not complete");
            alert.show();
        }
    }



//    @FXML
//    void addDeck(MouseEvent mouseEvent) {
//
//        if("".equals(textFieldDeckName.getText())) {
//
//        } else {
//
//        try() {
//            DeckDatabase deckDatabase = new DeckDatabase();
//            deckDatabase.setDeckName(deck, tf_deck_name.getText());
//
//            Alert alert = new Alert(AlertType.INFORMATION);
//            alert.setHeaderText("Success!");
//            alert.setContentText("New deck of flashcards was added to your list.");
//            alert.setTitle("New deck added.");
//            alert.show();
//
//            Parent parent = FXMLLoader.load(getClass().getResource("/view/DecksView.fxml"));
//            Scene scene = new Scene(parent);
//            Main.getPrimaryStage().setScene(scene);
//
//            Main.setSelectedDeck(null);
//        }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

}
