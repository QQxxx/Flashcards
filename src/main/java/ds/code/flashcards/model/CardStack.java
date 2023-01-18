package ds.code.flashcards.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class CardStack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private double avgScore;

    @Column
    private double lastScore;

    private ArrayList<Card> cardStack = new ArrayList<>();

    @Column(name = "user_id")
    private int userId;

    public CardStack(int id, String name, double avgScore, double lastScore) {
        this.id = id;
        this.name = name;
        this.avgScore = avgScore;
        this.lastScore = lastScore;
    }

    public CardStack() {}

    public void addCard(Card card) {
        this.cardStack.add(card);
    }

    public void removeCard(Card card){
        this.cardStack.remove(card);
    }

    /**
     * "Set" methods.
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public void setLastScore(double lastScore) {
        this.lastScore = lastScore;
    }

    /**
     * "Get" methods
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public double getLastScore() {
        return lastScore;
    }
}
