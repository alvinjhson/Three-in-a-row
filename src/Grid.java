public class Grid {
    private Game game;
    private ThreeInARow threeInARow;
    public Grid(Game game) {
        this.game = game;
        this.threeInARow = game.threeInARow;
    }
    public void printGrid(Player placeXO) {
        int[] tiles = {
                game.threeInARow.getTile1(),
                game.threeInARow.getTile2(),
                game.threeInARow.getTile3(),
                game.threeInARow.getTile4(),
                game.threeInARow.getTile5(),
                game.threeInARow.getTile6(),
                game.threeInARow.getTile7(),
                game.threeInARow.getTile8(),
                game.threeInARow.getTile9()
        };
        for (int i = 0; i < 9; i++) {
            switch (tiles[i]) {
                case 2:
                    System.out.print("X ");
                    break;
                case 7:
                    System.out.print("O ");
                    break;
                default:
                    System.out.print("  ");
                    break;
            }
            if (i % 3 == 2) {
                System.out.println();
                if (i < 8) {
                    System.out.println("---------");
                }
            } else {
                System.out.print("| ");
            }
        }
    }








}
