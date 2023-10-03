import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Grid grid = new Grid();
        Scanner sc = new Scanner(System.in);
        String meny = "";


        while (!meny.equals("6")) {
            game.addPlayer();
            game.threeInARow();
            meny = sc.nextLine();



            if (!meny.equals("6")){
                System.out.println("Game ended");
            }
        }
        sc.close();


    }
}