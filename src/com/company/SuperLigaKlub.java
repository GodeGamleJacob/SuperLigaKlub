package com.company;

import java.util.ArrayList;

public class SuperLigaKlub implements Comparable<SuperLigaKlub> {

    private String clubName;
    private String clubAddress;
    private String clubpostalNumber;
    private int gamesWon;
    private int gamesDraw;
    private int gamesLost;
    private int goals;
    private int redCards;
    private int yellowCards;
    private ArrayList<String> players;

    public SuperLigaKlub(String clubName, String clubAddress, String clubpostalNumber, int gamesWon, int gamesDraw, int gamesLost, int goals, int redCards, int yellowCards, ArrayList<String> players) {
        this.clubName = clubName;
        this.clubAddress = clubAddress;
        this.clubpostalNumber = clubpostalNumber;
        this.gamesWon = gamesWon;
        this.gamesDraw = gamesDraw;
        this.gamesLost = gamesLost;
        this.goals = goals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
        this.players = players;
    }

    @Override
    public String toString() {
        return "SuperLigaKlub" +
                "\nClubName= " + clubName +
                "\nGamesWon= " + gamesWon +
                "\nGamesDraw= " + gamesDraw +
                "\nGamesLost= " + gamesLost +
                "\nGoals= " + goals +
                "\nRedCards= " + redCards +
                "\nYellowCards= " + yellowCards +
                "\nPlayers= " + players +
                "\n";
    }

    @Override
    public int compareTo(SuperLigaKlub superLigaKlubben) {
        if (this.gamesWon == superLigaKlubben.gamesWon)
            return 0;
        else if (this.gamesWon < superLigaKlubben.gamesWon)
            return -1;
        else return 1;
    }

    public String getClubName() {
        return clubName;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getRedCards() {
        return redCards;
    }
}
/**
 * 1.	Implementer en klasse superligaKlub, der som minimum skal have medlemsvariablene:
 * Klubbens navn
 * Klubbens adresse
 * Klubbens postnummer
 * antal vundne kampe i den aktuelle sæson
 * antal uafgjorte kampe i den aktuelle sæson
 * antal spillede kampe i den aktuelle sæson
 * antal scoringer
 * antal udvisninger
 * antal gule kort
 * En datastruktur som indeholder navnene på spillere på superligaholdet
 * <p>
 * Test klassen i et main-program.
 */