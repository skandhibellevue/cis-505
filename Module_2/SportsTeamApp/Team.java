public class Team {
    // private properties
	private String teamName;
	private String[] players = new String[20];
	private int playerCount;
	
    // Constructor that initializes team name property
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
    // Method to add player to players array
	public void addPlayer(String player) {
		players[playerCount] = player;
		playerCount++;
	}
	
    // Getter method for players array
	public String[] getPlayers() {
		return players;
	}
	
    // Method that returns player count
	public int getPlayerCount() {
		return playerCount;
	}
	
    // Getter method for team name
	public String getTeamName() {
		return teamName;
	}
} // end Team