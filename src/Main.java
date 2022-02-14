import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        while (askIfWantsToThrowAgain()) {
            Game game = new Game(new Dice(), new Dice());
            player.addGame(game);

            showDicesValue(game);
            showPlayerStadistics(player);
            System.out.println("The ");
        }
    }

    private static void showPlayerStadistics(Player player) {
        System.out.println("Num Victories: " + player.countGamesWon());
        System.out.println("Num Partides: " + player.countGamesPlayed());
        System.out.println("Num of first dice been 5 is "+player.getNumberOfFirstDiceIsFive());
        System.out.println("Player has win three consecutive games? "+player.hasThreeConsecutiveVictories());
    }


    private static void showDicesValue(Game game) {
        System.out.println(game.printResult());
    }

    private static boolean askIfWantsToThrowAgain() {
        System.out.println("Vols tirar els daus? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");

    }
}
