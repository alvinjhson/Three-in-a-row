import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Grid grid = new Grid();
        Scanner sc = new Scanner(System.in);
        String meny = "";


        while (!meny.equals("4")) {
            System.out.println("""
                    1.Name players
                    2.Play Three in a row
                    3.Show Stats 
                    4.End the game
                    """);
            meny = sc.nextLine();
            //game.addPlayer();
            //game.threeInARow();
            //game.showPlayers();
            //meny = sc.nextLine();
            if (meny.equals("1")){
                game.addPlayer();
            }
            if (meny.equals("2")){
                game.threeInARow();
            }
            if (meny.equals("3")){
                game.showPlayers();
            }
            if (meny.equals("4")){
                System.out.println("Game ended");
            }
        }
        sc.close();


    }
}