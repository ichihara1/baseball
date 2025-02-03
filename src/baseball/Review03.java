package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam g=new BaseBallTeam("読売ジャイアンツ",68,72,3);
        g.report();

        BaseBallTeam t=new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        t.report();

        BaseBallTeam y=new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        y.report();

        BaseBallTeam han=new BaseBallTeam("阪神タイガース",68,71,4);
        han.report();

        BaseBallTeam hirosima=new BaseBallTeam("広島東洋カープ",66,72,3);
        hirosima.report();

        BaseBallTeam tyu=new BaseBallTeam("中日ドラゴンズ",66,75,2);
        tyu.report();
    }


}
