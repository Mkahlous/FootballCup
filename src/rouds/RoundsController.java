package rouds;

import teams.Teams;

import java.util.ArrayList;

public class RoundsController {

    public static ArrayList<Teams> getWinningTeam(ArrayList<Teams> teams) {
        ArrayList<Teams> winners = new ArrayList<>();
        //All members.
        ArrayList<Teams> firstGroup = new ArrayList<>();
        //firstGroup contain 4 random teams
        ArrayList<Teams> secondGroup = new ArrayList<>();
        //secondGroup contain 4 random teams
        for (int i = 0; i < teams.size(); i = i + 2) {
            firstGroup.add(teams.get(i));
            secondGroup.add(teams.get(i + 1));

          //  System.out.println(firstGroup.get(i).getClubName()+"Vs"+secondGroup.get(i).getClubName());
        }

        for(int i = 0; i < firstGroup.size(); i++){
            Teams winner = getWinner(firstGroup.get(i), secondGroup.get(i));

            winners.add(winner);
            System.out.println("Teh winner is " + " " +winner.getClubName());
        }
        System.out.println("******************");
        return winners;
    }

    public static Teams getWinner(Teams t1, Teams t2){
        double team1 = Math.random();
        double team2 = Math.random();
        if(team1>team2){
            return t1;
        }
        else{
            return t2;
        }
    }
}