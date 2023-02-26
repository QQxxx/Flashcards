package ds.code.flashcards.controller;

import ds.code.flashcards.model.Database;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CardController {

    @FXML
    private TextField front;

    @FXML
    private TextField back;

    @FXML
    private Label label;

    private Stage dialogStage;
    private String currentTable = "";
    private boolean isCanceled = false;

    /**
     *
     * @return
     */
    private boolean checkInputCorrectness() {
        if(front.getText().length() == 0 | front.getText() == null) { // incorrect input if front side is empty or contains null
            return false;
        } else if(back.getText().length() == 0 | back.getText() == null) { // incorrect input if back side is empty or contains null
            return false;
        } else { // in other cases input is correct
            return true;
        }
    }

    @FXML
    private void initializeCard() {
        label.setText("");
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setCurrentTable(String currentTable) {
        this.currentTable = currentTable;
    }

    public boolean returnCancellationStatus() {
        return isCanceled;
    }

    @FXML
    private void doActionCancelButton() {
        dialogStage.close();
        isCanceled = true;
    }

    /**
     *
     */
    @FXML
    private void doActionAddButton() {
        if(checkInputCorrectness()) {
            Database.addCardToList(currentTable, front.getText(), back.getText());
            String message = front.getText() + " has been successfully added!";
            front.clear();
            back.clear();
            label.setText(message);
        } else {
            label.setText("Please check correctness of the input. Card could not be added.");
        }
    }

}
