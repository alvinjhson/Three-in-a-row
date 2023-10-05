public class Player {
    private String name;
    private String xo;
    private int wins;
    private int timesPlayed;
    private int draw;
    private int scInput;
    public Player(String name, String xo, int wins, int timesPlayed , int scInput,int draw) {
        this.name = name;
        this.xo = xo;
        this.wins = wins;
        this.timesPlayed = timesPlayed;
        this.scInput = scInput;
        this.draw = draw;
    }
    public void setScInput(int scInput) {
        this.scInput = scInput;
    }
    public int getScInput() {
        return scInput;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addTimesPLayed(){
        this.timesPlayed++;
    }
    public void addWin(){
        this.wins++;
    }
    public void addDraws(){
        this.draw++;
    }
    @Override
    public String toString(){
        return "Player name: " + name + "\n" + "Your symbol is: " + xo + "\n" + "Wins: " + wins + "\n" + "Games played: " + timesPlayed + "\n" + "Draws: " + draw;
    }
}
