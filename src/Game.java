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
        setTielsToZero();
            win = false;
            for (int i = 0; i < 9 && !win ;i++) {
                if (i % 2 == 0) {
                    boolean validMove;
                    do {

                        Scanner scanner = new Scanner(System.in);
                        System.out.println(player1.getName() + " please make your move: ");
                        int chose1 = scanner.nextInt();
                        player1.setTile(chose1);
                        if (player1.getTile() == 1 && threeInARow.getTile1() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 2 && threeInARow.getTile2() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 3 && threeInARow.getTile3() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 4 && threeInARow.getTile4() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 5 && threeInARow.getTile5() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 6 && threeInARow.getTile6() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 7 && threeInARow.getTile7() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 8 && threeInARow.getTile8() != 0) {
                            validMove = false;
                        } else if (player1.getTile() == 9 && threeInARow.getTile9() != 0) {
                            validMove = false;
                        } else {
                            validMove = true;
                        }
                    } while (!validMove);

                    if (player1.getTile() == 1 && threeInARow.getTile1() == 0  ){
                        //gride.baseGrid8(player1);
                       tile1x();
                    } if (player1.getTile() == 2 &&  threeInARow.getTile2() == 0 ){
                        gride.baseGrid8(player1);
                        tile2x();
                    } if (player1.getTile() == 3 &&  threeInARow.getTile3() == 0 ){
                        gride.baseGrid8(player1);
                        tile3x();
                    } if (player1.getTile() == 4 &&  threeInARow.getTile4() == 0 ){
                        gride.baseGrid8(player1);
                        tile4x();
                    }  if (player1.getTile() == 5 &&  threeInARow.getTile5() == 0 ){
                        gride.baseGrid8(player1);
                        tile5x();
                    }  if (player1.getTile() == 6 &&  threeInARow.getTile6() == 0 ){
                        gride.baseGrid8(player1);
                        tile6x();
                    }  if (player1.getTile() == 7 &&  threeInARow.getTile7() == 0 ){
                        gride.baseGrid8(player1);
                        tile7x();
                    }  if (player1.getTile() == 8 &&  threeInARow.getTile8() == 0 ){
                        gride.baseGrid8(player1);
                       tile8x();
                    }  if (player1.getTile() == 9 && threeInARow.getTile9() == 0){
                        gride.baseGrid9(player1);
                        tile9x();
                    }  if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9() == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile3() + threeInARow.getTile6() + threeInARow.getTile9()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile8() + threeInARow.getTile5() + threeInARow.getTile2()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile7() + threeInARow.getTile4() + threeInARow.getTile1()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile4() + threeInARow.getTile5() + threeInARow.getTile6()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile1() + threeInARow.getTile2() + threeInARow.getTile3()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile1() + threeInARow.getTile5() + threeInARow.getTile9()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }  if (threeInARow.getTile3() + threeInARow.getTile5() + threeInARow.getTile7()  == 6 ) {
                        System.out.println(player1.getName() + " Wins the game");
                        win = true;
                        player1.addWin();
                    }
                } else {
                    boolean validMove2;
                    do {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println(player2.getName() + " please make your move: ");
                        int chose2 = scanner.nextInt();
                        player2.setTile(chose2);
                        if (player2.getTile() == 1 && threeInARow.getTile1() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 2 && threeInARow.getTile2() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 3 && threeInARow.getTile3() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 4 && threeInARow.getTile4() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 5 && threeInARow.getTile5() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 6 && threeInARow.getTile6() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 7 && threeInARow.getTile7() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 8 && threeInARow.getTile8() != 0) {
                            validMove2 = false;
                        } else if (player2.getTile() == 9 && threeInARow.getTile9() != 0) {
                            validMove2 = false;
                        } else {
                            validMove2 = true;
                        }
                    } while (!validMove2);
                    if (player2.getTile() == 1 && threeInARow.getTile1() == 0){
                        //gride.baseGrid7(player2);
                        tile1O();
                    } if (player2.getTile() == 2 && threeInARow.getTile2() == 0){
                        tile2O();
                    } if (player2.getTile() == 3 && threeInARow.getTile3() == 0){
                        tile3O();
                    } if (player2.getTile() == 4 && threeInARow.getTile4() == 0){
                        tile4O();
                    } if (player2.getTile() == 5 && threeInARow.getTile5() == 0){
                        tile5O();
                    } if (player2.getTile() == 6 && threeInARow.getTile6() == 0){
                        tile6O();
                    } if (player2.getTile() == 7 && threeInARow.getTile7() == 0){
                        gride.baseGrid8(player2);
                        tile7O();
                    } if (player2.getTile() == 8 && threeInARow.getTile8() == 0){
                        gride.baseGrid8(player2);
                        tile8O();
                    } if (player2.getTile() == 9 && threeInARow.getTile9() == 0){
                        gride.baseGrid9(player2);
                        tile9O();
                    } if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile8() + threeInARow.getTile7() + threeInARow.getTile9()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile3() + threeInARow.getTile6() + threeInARow.getTile9()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile8() + threeInARow.getTile5() + threeInARow.getTile2()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile7() + threeInARow.getTile4() + threeInARow.getTile1()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }else if (threeInARow.getTile4() + threeInARow.getTile5() + threeInARow.getTile6()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile1() + threeInARow.getTile2() + threeInARow.getTile3()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile1() + threeInARow.getTile5() + threeInARow.getTile9()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    } else if (threeInARow.getTile3() + threeInARow.getTile5() + threeInARow.getTile7()  == 21 ) {
                        System.out.println(player2.getName() + " Wins the game");
                        win = true;
                        player2.addWin();
                    }
                }
            } if (!win) {
                System.out.println("Draw");
        }
            player2.addTimesPLayed();
            player1.addTimesPLayed();

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


}
