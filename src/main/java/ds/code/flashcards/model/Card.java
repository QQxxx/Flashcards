package ds.code.flashcards.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Card {


    // Each flashcard should have its own unique number.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String front;

    @Column(nullable = false)
    private String back;

    @Column(nullable = false)
    private int numberOfAppearance;

    @Column(nullable = false)
    private boolean isLastAnswerCorrect;

    @Column(nullable = false)
    private int numberOfCorrectAnswers;

    public Card(int id, String front, String back) {
        this.id = id;
        this.front = front;
        this.back = back;
    }

    /**
     * Sets the card id.
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the card front.
     * @param front
     */
    public void setFront(String front) {
        this.front = front;
    }

    /**
     * Sets the card back.
     * @param back
     */
    public void setBack(String back) {
        this.back = back;
    }


    /**
     * Gets the id of the card.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the front side of the card.
     * @return front
     */
    public String getFront() {
        return front;
    }

    /**
     * Gets the id of the card.
     * @return id
     */
    public String getBack() {
        return back;
    }
}


