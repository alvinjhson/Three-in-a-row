import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    Grid gride = new Grid();
    private boolean win;
    Player player1 = new Player("player1","X",0,0,0);
    Player player2 = new Player("player2","O",0,0,0);
    ThreeInARow threeInARow = new ThreeInARow(0,0,0,0,0,0,0,0,0);

    public ThreeInARow getThreeInARow() {
        return threeInARow;
    }

    public void addPlayer() {
        System.out.println("Player1 what is your name:");
        player1.setName(sc.nextLine());
        System.out.println("Player2 what is your name");
        player2.setName(sc.nextLine());
        System.out.println(player1);
        System.out.println("");
        System.out.println(player2);
    }


    public void threeInARow(){

        //while (win = true){
            win = false;

            for (int i = 0; i < 9 && !win ;i++) {
                if (i % 2 == 0) {
                    boolean validMove;
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Player 1, please make your move: ");
                        int chose1 = scanner.nextInt();
                        player1.setTile(chose1);

                        if (player1.getTile() == 7 && threeInARow.getTile7() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 8 && threeInARow.getTile8() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 9 && threeInARow.getTile9() != 0) {
                            validMove = false;
                        } else {
                            validMove = true;
                        }
                    } while (!validMove);

                    if (player1.getTile() == 7 && threeInARow.getTile7() == 0  ){
                        //gride.baseGrid8(player1);
                       tile7x();
                    }
                    if (player1.getTile() == 8 &&  threeInARow.getTile8() == 0 ){
                        gride.baseGrid8(player1);
                       tile8x();
                    }
                    if (player1.getTile() == 9 && threeInARow.getTile9() == 0){
                        gride.baseGrid9(player1);
                        tile9x();
                    }
                    if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9()  == 6 ) {
                        System.out.println("Vinner");
                        win = true;
                    }
                } else {
                    boolean validMove2;
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Player 2, please make your move: ");
                        int chose2 = scanner.nextInt();
                        player2.setTile(chose2);
                        if (player2.getTile() == 7 && threeInARow.getTile7() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 8 && threeInARow.getTile8() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 9 && threeInARow.getTile9() != 0) {
                            validMove2 = false;
                        } else {
                            validMove2 = true;
                        }
                    } while (!validMove2);
                    if (player2.getTile() == 7 && threeInARow.getTile7() == 0){
                        //gride.baseGrid7(player2);
                        tile7O();
                    }
                    if (player2.getTile() == 8 && threeInARow.getTile8() == 0){
                        gride.baseGrid8(player2);
                        tile8O();
                    }
                    if (player2.getTile() == 9 && threeInARow.getTile9() == 0){
                        gride.baseGrid9(player2);
                        tile9O();
                    }
                    if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9()  == 21 ) {
                        System.out.println("Vinner");
                        win = true;
                    }

                }
            }
    }
    public void tile1x() {
      threeInARow.setTile9(2);
    }
    public void tile2x() {
        threeInARow.setTile2(2);
    }
    public void tile3x() {
        threeInARow.setTile3(2);
    }
    public void tile4x() {
        threeInARow.setTile4(2);
    }
    public void tile5x() {
        threeInARow.setTile5(2);
    }
    public void tile6x() {
        threeInARow.setTile6(2);
    }
    public void tile7x() {
        threeInARow.setTile7(2);
    }
    public void tile8x() {
        threeInARow.setTile8(2);
    }
    public void tile9x() {
        threeInARow.setTile9(2);
    }
    public void tile1O() {
        threeInARow.setTile1(1);
    }
    public void tile2O() {
        threeInARow.setTile2(1);
    }
    public void tile3O() {
        threeInARow.setTile3(1);
    }
    public void tile4O() {
        threeInARow.setTile4(1);
    }
    public void tile5O() {
        threeInARow.setTile5(1);
    }
    public void tile6O() {
        threeInARow.setTile6(1);
    }
    public void tile7O() {
        threeInARow.setTile7(7);
    }
    public void tile8O() {
        threeInARow.setTile8(7);
    }
    public void tile9O() {
        threeInARow.setTile9(7);
    }


}
