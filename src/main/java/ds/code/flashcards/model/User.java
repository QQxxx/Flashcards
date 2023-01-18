package ds.code.flashcards.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int highScore;

    @Column
    private int totalNumberOfGames;

    public User(int id, String name, int highScore, int totalNumberOfGames) {
        this.id = id;
        this.name = name;
        this.highScore = highScore;
        this.totalNumberOfGames = totalNumberOfGames;
    }

    public User() {

    }

    /**
     "Set" methods.
     */
    public void setId() {
        this.id = id;
    }

    public void setName() {
        this.name = name;
    }

    public void setHighScore() {
        this.highScore = highScore;
    }

    public void setTotalNumberOfGames() {
        this.totalNumberOfGames = totalNumberOfGames;
    }

    /**
        "Get" methods.
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getTotalNumberOfGames() {
        return totalNumberOfGames;
    }


}
