package Connect4Backend.datasource.repository.model;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "session")
public class SessionEntity {

    @Id
    private UUID sessionId;

    private ZonedDateTime lastPolledRed;
    private ZonedDateTime lastPolledYellow;
    private UUID playerRed;
    private UUID playerYellow;

    private UUID game;

    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

    public ZonedDateTime getLastPolledRed() {
        return lastPolledRed;
    }

    public void setLastPolledRed(ZonedDateTime lastPolledRed) {
        this.lastPolledRed = lastPolledRed;
    }

    public ZonedDateTime getLastPolledYellow() {
        return lastPolledYellow;
    }

    public void setLastPolledYellow(ZonedDateTime lastPolledYellow) {
        this.lastPolledYellow = lastPolledYellow;
    }

    public UUID getPlayerRed() {
        return playerRed;
    }

    public void setPlayerRed(UUID playerRed) {
        this.playerRed = playerRed;
    }

    public UUID getPlayerYellow() {
        return playerYellow;
    }

    public void setPlayerYellow(UUID playerYellow) {
        this.playerYellow = playerYellow;
    }

    public UUID getGame() {
        return game;
    }

    public void setGame(UUID game) {
        this.game = game;
    }
}
