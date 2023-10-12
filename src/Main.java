import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        String meny = "";
        while (!meny.equals("5")) {
            System.out.println("""
                    1.Name players
                    2.Play Three in a row
                    3.Show Stats 
                    4.Play Against Bot
                    5.End the game
                    """);
            meny = sc.nextLine();
            if (meny.equals("1")){
                game.addPlayer();
            }
            if (meny.equals("2")){
                game.playThreeInARow();
            }
            if (meny.equals("3")){
                game.showPlayers();
            }
            if (meny.equals("4")){
                game.playAgainstBot();
            }
            if (meny.equals("5")){
                System.out.println("Game ended");
            }
        }
        sc.close();
    }
}