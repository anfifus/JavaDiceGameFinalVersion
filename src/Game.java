public class Game {
    private Dice dice1;
    private Dice dice2;




    public Game(Dice dice1, Dice dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }


    public boolean hasWon() {
        int result = this.dice1.getValue() + this.dice2.getValue();
        return result == 7;
    }

    public Dice getDice1() {
        return dice1;
    }

    public Dice getDice2() {
        return dice2;
    }

    public String printResult() {
        String text = "";
        text += "El resultat del dau 1 es: " + getDice1().getValue();
        text += "\n El resultat del dau 2 es: " + getDice2().getValue();
        text += "\n El resultat total de la tirada dels daus es: " + (getDice1().getValue() + getDice2().getValue());
        if (hasWon()) {
            text += "Has guanyat la partida! :D";
        } else {
            text += "Has perdut la partida :'(";
        }
        return text;
    }
    public boolean countGamesWithFirstDiceIsFive(){
        return  dice1.getValue()==5;
    }

}
