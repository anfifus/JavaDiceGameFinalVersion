import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Game> gameList = new ArrayList<>();

    public Player() {

    }

    public void addGame(Game game) {
        this.gameList.add(game);
    }

    public int countGamesPlayed() {
        return gameList.size();
    }

    public int countGamesWon() {
        int numWins = 0;
        for (Game currentGame : gameList) {
            if (currentGame.hasWon()) {
                numWins++;
            }
        }
        return numWins;
    }

    public int getNumberOfFirstDiceIsFive() {
        int contIfIsFive = 0;
        for (Game currentGame : gameList) {
            if (currentGame.countGamesWithFirstDiceIsFive()) {
                contIfIsFive++;
            }
        }
        return contIfIsFive;
    }

    public boolean hasThreeConsecutiveVictories() {
        int contThreeConsecutive = 0;
        for (Game currentGame : gameList) {
            if (currentGame.hasWon()) {
                contThreeConsecutive++;
            } else {
                contThreeConsecutive = 0;
            }
            if (contThreeConsecutive == 3) {
                return true;
            }
        }
        return false;
    }

}
