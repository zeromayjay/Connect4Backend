package Connect4Backend.datasource.repository.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "game")
public class GameEntity {

    @Id
    private UUID gameId;
    private String gameState;
    private String gameBoard;

    public UUID getUuid() {
        return gameId;
    }

    public void setUuid(UUID uuid) {
        this.gameId = uuid;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public String getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String gameBoard) {
        this.gameBoard = gameBoard;
    }
}
