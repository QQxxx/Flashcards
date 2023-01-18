package ds.code.flashcards.controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class OverviewController {

    @FXML
    private TableView<SimpleStringProperty> flashcardTable;

    @FXML
    private TableColumn<SimpleStringProperty, String> flashcardListColumn;

    @FXML
    private Label backLabel;

    @FXML
    private Label frontLabel;


}
