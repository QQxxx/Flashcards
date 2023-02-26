package ds.code.flashcards.controller;

import ds.code.flashcards.App;
import ds.code.flashcards.model.Card;
import ds.code.flashcards.model.CardStack;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ds.code.flashcards.view.View;

public class CardStackController {

    // Front side of flashcard.
    @FXML
    private Label front;

    @FXML
    private Label back;

    // Use SimpleStringProperties, because then we can treat these properties as kind of independent objects.
    // We can also add listeners following them.

    @FXML
    private TableView<SimpleStringProperty> flashCards;

    @FXML
    private TableColumn<SimpleStringProperty, String> flashcardsColumn;

    private ObservableList<SimpleStringProperty> observableListOfCards = FXCollections.observableArrayList();

    private App app;

    private CardStack cardStack = new CardStack();

    private Card card = new Card();



    /**
     *
     */
    @FXML
    private void initialize() {
        front.setText("");
        back.setText("");

        flashcardsColumn.setCellValueFactory(
                cellData -> cellData.getValue()
        );

        // Add listener.
        flashCards
                .getSelectionModel()
                .selectedItemProperty()
                .addListener(
                        (observable, oldSelection, newSelection) -> View.displayDetails(newSelection));
    }

    @FXML
    private void addFlashcard() {
        cardStack.addCard(card);
    }

    @FXML
    private void nextFlashcard() {

    }

    public void setApp(App app) {
        this.app = app;
    }


}
