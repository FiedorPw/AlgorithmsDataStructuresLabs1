public class Main {

    public static void main(String[] args) {

        DaneZespołów WLUscores = new DaneZespołów(); //WLU-warszawska liga ultimate


        WLUscores.setWholeTeam("RJP",5);
        WLUscores.setWholeTeam("SkyThis",5);

        WLUscores.addWin("RJP");
        WLUscores.addLoss("SkyThis");
        WLUscores.printData();
    }
}
