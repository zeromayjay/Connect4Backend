package Connect4Backend.Connect4Backend;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.UUID;

@Entity
@Table(name = "Games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private UUID session;
    private String gameState;
    private String[][] gameBoard;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getSession() {
        return session;
    }

    public void setSession(UUID session) {
        this.session = session;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
