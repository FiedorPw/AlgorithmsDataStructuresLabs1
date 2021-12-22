/*
    klasa jest inspirowane jest https://scores.frisbee.pl/

 */

import java.util.ArrayList;

import static java.util.logging.Logger.global;

public class DaneZespołów {
    byte numberOfTeams = 3;
    ArrayList<String> teams = new ArrayList<>();
    ArrayList<Integer> players = new ArrayList<>();
    ArrayList<Integer> wins  = new ArrayList<>();
    ArrayList<Integer> losses = new ArrayList<>();
    int number = 0; //licznik porządkowy wpisywania w liste
   static ArrayList<Integer> test = new ArrayList<>();

    public static void main(String[] args) {
        test.add(2);
        test.add(3);

        System.out.println(test.get(0));
    }


    public void setWholeTeam(String team, int playerCount) {
        players.add(playerCount);
        teams.add(team);
        wins.add(0);
        losses.add(0);
        number++;
    }
    public void addWin(String team) {
        wins.get(teams.indexOf(team));
        wins.add(teams.indexOf(team),teams.);
    }
   /* public void addLoss(String team) {
        for(int i = 0; i < number;i++) {
            if(teams[i].equals(team)) losses[i]++;
        }
    }*/

    public void printData(){
        System.out.println("teams players wins losses");
        for(int i = 0;i < teams.toArray().length-1;i++){
            System.out.println(teams.get(i) + "   "+ players.get(i)+ "     "+ wins.get(i) + "    "+ losses.get(i));
        }
    }
}
