/*
    klasa jest inspirowane jest https://scores.frisbee.pl/

 */

import java.util.ArrayList;

import static java.util.logging.Logger.global;

public class DaneZespołów {
    byte numberOfTeams = 3;
    String[] teams = new String[numberOfTeams];
    int players[] = new int[numberOfTeams];
    int wins[] = new int[numberOfTeams];
    int losses[] = new int[numberOfTeams];
    int number = 0; //licznik porządkowy wpisywania w liste
   static ArrayList<Integer> test = new ArrayList();

    public static void main(String[] args) {
        test.add(2);
        test.add(3);

        System.out.println(test.get(0));
    }


    public void setWholeTeam(String team, int playerCount) {
        players[number] = playerCount;
        teams[number] = team;
        number++;
    }
    public void addWin(String team) {
        for(int i = 0; i < number;i++) {
            if(teams[i].equals(team)) wins[i]++;
        }
    }
    public void addLoss(String team) {
        for(int i = 0; i < number;i++) {
            if(teams[i].equals(team)) losses[i]++;
        }
    }

    public void printData(){
        System.out.println("teams players wins losses");
        for(int i = 0;i <number;i++){
            System.out.println(teams[i] + "   "+ players[i] + "     "+ wins[i] + "    "+ losses[i]);
        }
    }
}
