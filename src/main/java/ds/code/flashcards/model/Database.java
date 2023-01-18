package ds.code.flashcards.model;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    // default constructor
    public Database() {};


    private static Connection connection = null;
    private static Statement statement = null;

    /**
     * Creates the connection to mysql database.
     * @return boolean - true if connection was created, false otherwise.
     */
    public static boolean getConnection() {

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/flashcards", "root", "root");
            statement = connection.createStatement();
            return true;
        } catch (SQLException e1) {
            e1.printStackTrace();
            return false;
        }
    }

    /**
     * Closes the connection with mysql database.
     * @return boolean - true if connection was closed, false otherwise.
     */
    public static boolean closeConnection() {

        try {
            statement.close();
            connection.close();
            // Statement and connection successfully closed
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }
    }

    /**
     *
     * @return boolean - true if new table was created, false otherwise.
     */
    public static boolean createListOf() { // TODO change the name of method
        try {
            // Name of each list with flashcards should be unique.
            String query = "CREATE TABLE FlashcardList (id INTEGER PRIMARY KEY NOT NULL, name VARCHAR(30) UNIQUE NOT NULL)";
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Sets a new name for list of flashcards.
     * @param newFlashcardsList
     * @return
     */
    public static boolean setNameOfFlashcardsList(String newFlashcardsList) {
        try {
            String query = "INSERT INTO flashcards.flashcards_list (id, name) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, null);
            statement.setString(2, newFlashcardsList.toLowerCase());
            statement.executeUpdate();
            statement.close();

            // Create new table based on the flashcard list defined above.
            newFlashcardsDesk(newFlashcardsList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void newFlashcardsDesk(String newDesk) {
        try {
            String query = "CREATE TABLE " + newDesk.toLowerCase()
                    + "(id INTEGER PRIMARY KEY NOT NULL, "
                    + "front VARCHAR(50) NOT NULL, "
                    + "back VARCHAR(50) NOT NULL)";

            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param tableFromDB
     * @param front
     * @param back
     * @return
     */
    public static boolean addCardToList(String tableFromDB, String front, String back) {
        try {
            String query = "INSERT INTO " + tableFromDB.toLowerCase()
                    + "(id, front, back) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, null);
            statement.setString(2, front);
            statement.setString(3, back);
            statement.executeUpdate();
            statement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * @param tableFromDB
     * @param cardID
     * @return
     */
    public static boolean removeCardFromList(String tableFromDB, int cardID) {
        try {
            String query = "";
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     *
     * @param deskName
     * @return
     */
    public static ArrayList<Card> getFlashcardsList(String deskName) {
        ArrayList<Card> flashcardsDesk = new ArrayList<Card>();

        try {
            String query = ""; // TODO finish the query
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()) { // Method next() moves the cursor forward one row from its current position. It returns false when there are no more rows.
                String front = resultSet.getString("front");
                String back = resultSet.getString("back");
                String cardID = resultSet.getString("id");
                int cardIDConverted = Integer.parseInt(cardID);

                Card card = new Card(cardIDConverted, front, back);
                flashcardsDesk.add(card);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flashcardsDesk;
    }

    /**
     * Removes the specified flashcard desk.
     * @param deskName
     * @return
     */
    public static boolean removeFlashcardDesk(String deskName) {
        try {
            String query = "DROP TABLE " + deskName; // TODO finish the query
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}
