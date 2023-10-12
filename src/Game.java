import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Game {
    Scanner sc = new Scanner(System.in);
    Grid grid;
    private boolean win;
    Player player1 = new Player("player1","X",0,0,0,0);
    Player player2 = new Player("player2","O",0,0,0,0);
    ThreeInARow threeInARow = new ThreeInARow(0,0,0,0,0,0,0,0,0);

    public Game() {
        grid = new Grid(this);
    }
    public void addPlayer() {
        resetPlayer();
        System.out.println("Player1 what is your name:");
        player1.setName(sc.nextLine());
        System.out.println("Player2 what is your name");
        player2.setName(sc.nextLine());
        System.out.println(player1);
        System.out.println("");
        System.out.println(player2);
    }
    public void playAgainstBot(){
        resetPlayer();
        System.out.println("Player1 what is your name:");
        player1.setName(sc.nextLine());
        player2.setName("Bot");
        System.out.println(player1);
        System.out.println("");
        System.out.println(player2);
    }
    public void threeInARow1(){
        setTielsToZero();
            win = false;
            for (int i = 0; i < 9 && !win ;i++) {
                if (i % 2 == 0) {
                    boolean validMove;
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(player1.getName() + " please make your move: ");
                        int player1Input = scanner.nextInt();
                        player1.setScInput(player1Input);
                        if (player1.getScInput() == 1 && threeInARow.getTile1() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 2 && threeInARow.getTile2() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 3 && threeInARow.getTile3() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 4 && threeInARow.getTile4() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 5 && threeInARow.getTile5() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 6 && threeInARow.getTile6() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 7 && threeInARow.getTile7() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 8 && threeInARow.getTile8() != 0) {
                            validMove = false;
                        } else if (player1.getScInput() == 9 && threeInARow.getTile9() != 0) {
                            validMove = false;
                        } else {
                            validMove = true;
                        }
                    } while (!validMove);
                    if (player1.getScInput() == 1){
                       tile1x();
                        grid.printGrid();
                    } if (player1.getScInput() == 2){
                        tile2x();
                        grid.printGrid();
                    } if (player1.getScInput() == 3){
                        tile3x();
                        grid.printGrid();
                    } if (player1.getScInput() == 4){
                        tile4x();
                        grid.printGrid();
                    } if (player1.getScInput() == 5){
                        tile5x();
                        grid.printGrid();
                    } if (player1.getScInput() == 6){
                        tile6x();
                        grid.printGrid();
                    } if (player1.getScInput() == 7){
                        tile7x();
                        grid.printGrid();
                    } if (player1.getScInput() == 8){
                        tile8x();
                        grid.printGrid();
                    } if (player1.getScInput() == 9 ){
                        tile9x();
                        grid.printGrid();
                    } if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9() == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile3() + threeInARow.getTile6() + threeInARow.getTile9()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile8() + threeInARow.getTile5() + threeInARow.getTile2()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile7() + threeInARow.getTile4() + threeInARow.getTile1()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile4() + threeInARow.getTile5() + threeInARow.getTile6()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile1() + threeInARow.getTile2() + threeInARow.getTile3()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile1() + threeInARow.getTile5() + threeInARow.getTile9()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    } if (threeInARow.getTile3() + threeInARow.getTile5() + threeInARow.getTile7()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }
                } else {
                    boolean validMove2;
                    do {
                        if (player2.getName() == "Bot") {
                            Random random = new Random();
                            int n = random.nextInt(9 ) + 1;
                            player2.setScInput(n);
                        }else{
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(player2.getName() + " please make your move: ");
                        int player2Input = scanner.nextInt();
                        player2.setScInput(player2Input);}
                        if (player2.getScInput() == 1 && threeInARow.getTile1() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 2 && threeInARow.getTile2() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 3 && threeInARow.getTile3() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 4 && threeInARow.getTile4() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 5 && threeInARow.getTile5() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 6 && threeInARow.getTile6() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 7 && threeInARow.getTile7() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 8 && threeInARow.getTile8() != 0) {
                            validMove2 = false;
                        } else if (player2.getScInput() == 9 && threeInARow.getTile9() != 0) {
                            validMove2 = false;
                        } else {
                            validMove2 = true;
                        }
                    } while (!validMove2);
                    if (player2.getName() == "Bot") {
                        System.out.println( player2.getName() + " makes a move");
                    }
                    if (player2.getScInput() == 1){
                        tile1O();
                        grid.printGrid();
                    } if (player2.getScInput() == 2){
                        tile2O();
                        grid.printGrid();
                    } if (player2.getScInput() == 3){
                        tile3O();
                        grid.printGrid();
                    } if (player2.getScInput() == 4){
                        tile4O();
                        grid.printGrid();
                    } if (player2.getScInput() == 5){
                        tile5O();
                        grid.printGrid();
                    } if (player2.getScInput() == 6){
                        tile6O();
                        grid.printGrid();
                    } if (player2.getScInput() == 7){
                        tile7O();
                        grid.printGrid();
                    } if (player2.getScInput() == 8){
                        tile8O();
                        grid.printGrid();
                    } if (player2.getScInput() == 9){
                        tile9O();
                        grid.printGrid();
                    } if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile3() + threeInARow.getTile6() + threeInARow.getTile9() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile8() + threeInARow.getTile5() + threeInARow.getTile2() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile7() + threeInARow.getTile4() + threeInARow.getTile1() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile4() + threeInARow.getTile5() + threeInARow.getTile6() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile1() + threeInARow.getTile2() + threeInARow.getTile3() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile1() + threeInARow.getTile5() + threeInARow.getTile9() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile3() + threeInARow.getTile5() + threeInARow.getTile7() == 21) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }
                }
            } if (!win) {
                System.out.println("Draw");
                player1.addDraws();
                player2.addDraws();
        }
            player1.addTimesPLayed();
            player2.addTimesPLayed();
    }

    public void showPlayers(){
        System.out.println(player1);
        System.out.println("");
        System.out.println(player2);
    }
    public void tile1x() {
      threeInARow.setTile1(2);
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
        threeInARow.setTile1(7);
    }
    public void tile2O() {
        threeInARow.setTile2(7);
    }
    public void tile3O() {
        threeInARow.setTile3(7);
    }
    public void tile4O() {
        threeInARow.setTile4(7);
    }
    public void tile5O() {
        threeInARow.setTile5(7);
    }
    public void tile6O() {
        threeInARow.setTile6(7);
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
    public void setTielsToZero(){
        threeInARow.setTile1(0);
        threeInARow.setTile2(0);
        threeInARow.setTile3(0);
        threeInARow.setTile4(0);
        threeInARow.setTile5(0);
        threeInARow.setTile6(0);
        threeInARow.setTile7(0);
        threeInARow.setTile8(0);
        threeInARow.setTile9(0);
    }
    public void resetPlayer(){
        player1.setDraw(0);
        player1.setWins(0);
        player1.setTimesPlayed(0);
        player2.setDraw(0);
        player2.setWins(0);
        player2.setTimesPlayed(0);
    }
}
