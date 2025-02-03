package baseball;

public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name=name;
        this.win=win;
        this.lose=lose;
        this.draw=draw;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        double rate=(double)this.win/(this.win+this.lose);
        return rate;
    }

    public void report() {
        double getRate=getRate();
        System.out.println(this.getName()+"の２０２０年の成績は"+this.getWin()+"勝"+this.getLose()+"敗"+this.getDraw()+"分、勝率は"+getRate+"です。");


    }


}
