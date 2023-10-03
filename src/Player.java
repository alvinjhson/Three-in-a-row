public class Player {
    private String name;
    private String xo;
    private int wins;
    private int timesPlayed;
    private int tile;

    public Player(String name, String xo, int wins, int timesPlayed , int tile) {
        this.name = name;
        this.xo = xo;
        this.wins = wins;
        this.timesPlayed = timesPlayed;
        this.tile = tile;
    }

    public void setTile(int tile) {
        this.tile = tile;
    }

    public int getTile() {
        return tile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setXo(String xo) {
        this.xo = xo;
    }

    public String getXo() {
        return xo;
    }

    @Override
    public String toString(){
        return "Player name: " + name + "\n" + "Your symbol is: " + xo + "\n" + getName() + " wins: " + wins + "\n" + "Times played: " + timesPlayed;
    }
}
