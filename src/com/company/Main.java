package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer dan = new SoccerPlayer("Dan");

        Team<FootballPlayer> newYork = new Team<>("New York");
        newYork.addPlayer(joe);
//        someTeam.addPlayer(pat);
//        someTeam.addPlayer(dan);

        System.out.println(newYork.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Clubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Other Club");
        soccerTeam.addPlayer(dan);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer brandon = new FootballPlayer("Brandon");
        melbourne.addPlayer(brandon);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(newYork,3,8);

        newYork.matchResult(fremantle,2,1);
       // someTeam.matchResult(baseballTeam,1,1);
        System.out.println("Rankings");
        System.out.println(newYork.getName() + ": " + newYork.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println(newYork.compareTo(melbourne));
        System.out.println(newYork.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(newYork));

//        ArrayList<Team> teams;
//        Collections.sort(teams);

    }
}
