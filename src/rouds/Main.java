package rouds;

import teams.Teams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String [] args){
        Teams fc1 = new Teams();
        Teams fc2 = new Teams();
        Teams fc3 = new Teams();
        Teams fc4 = new Teams();
        Teams fc5 = new Teams();
        Teams fc6 = new Teams();
        Teams fc7 = new Teams();
        Teams fc8 = new Teams();

        fc1.setClubName("FC1");
        fc2.setClubName("FC2");
        fc3.setClubName("FC3");
        fc4.setClubName("FC4");
        fc5.setClubName("FC5");
        fc6.setClubName("FC6");
        fc7.setClubName("FC7");
        fc8.setClubName("FC8");

        ArrayList<Teams> teams = new ArrayList<>();
        teams.add(fc1);
        teams.add(fc2);
        teams.add(fc3);
        teams.add(fc4);
        teams.add(fc5);
        teams.add(fc6);
        teams.add(fc7);
        teams.add(fc8);

        Collections.shuffle(teams);

        ArrayList<Teams> round1Winners = new ArrayList<>();
        round1Winners = RoundsController.getWinningTeam(teams);

        ArrayList<Teams> round2Winners = new ArrayList<>();
        round2Winners = RoundsController.getWinningTeam(round1Winners);

        ArrayList<Teams> finalWinner = new ArrayList<>();
        finalWinner = RoundsController.getWinningTeam(round2Winners);

        System.out.println("Champion is:" + finalWinner.get(0).getClubName());

    }
}
