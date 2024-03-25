/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/ 

import java.util.Scanner;

public class TestSportsTeamApp {
	public static void main(String[] args) {
        // Create instance of Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Sports Team App");
		System.out.println();

        // boolean property to continue entering multiple team entries
        boolean continueTeam = true;

        do {
            // promt user to enter team name
            System.out.print("Enter a team name: ");

            // read team name input
            String teamName = input.nextLine();

            System.out.print("Enter the player names:\n\thint: use commas for multiple players; no spaces>: ");
            String players = input.nextLine();
            
            // Create instance of class Team with team name
            Team team = new Team(teamName);
            
            // Separate player names using split function in to a string array 
            String[] playerArray = players.split(",");
            
            // Add each plyer to players array in Team class
            for (String player : playerArray) {
                team.addPlayer(player);
            }
            
            // Print entered player details to console 
            System.out.println();
            System.out.println("--Team Summary--");
            System.out.println("Number of players in team: " + team.getPlayerCount());
            System.out.print("Players on team: ");
            
            for (String player : team.getPlayers()) {
                if (player != null)
                    System.out.print(player + ", ");
            }
            
            System.out.println();
            System.out.println();

            // Promt user to continue or not
            System.out.println("Continue? (y/n)");

            String continuePrompt = input.nextLine();

            if (continuePrompt.equalsIgnoreCase("n")) {
                continueTeam = false;
            }
        } while (continueTeam); // Continues execution until user enters "n"
	} // end main
} // end TestSportsTeamApp