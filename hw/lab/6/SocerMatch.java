
public class SocerMatch {
	private double startTime;
	private double endTime;
	private String venue;
	private String homeTeamName;
	private String visitorTeamName;
	private int [] homePlayers = new int[11];
	private int [] visitorPlayers = new int[11];
	private int[] homeGoals = new int [10];
	private int[] visitorGoals = new int[10];
	
SocerMatch() {
	
}

public int[] getHomePlayers() {
	return homePlayers;
}

public void addHomePlayers(Player newPlayer) {
	getHomePlayers()[numPlayers] = newPlayer;
        numPlayers++;
}

public void addVisitorPlayers(int visitorPlayers) {
	for(int i = 0; i< visitorPlayers; i++);
}

public int[] getHomeGoals() {
	return homeGoals;
}

public void addHomeGoals(int[] homeGoals) {
	this.homeGoals = homeGoals;
}

public int[] getVisitorGoals() {
	return visitorGoals;
}

public void addVisitorGoals(int visitorGoals) {
}
}

	
	
	

