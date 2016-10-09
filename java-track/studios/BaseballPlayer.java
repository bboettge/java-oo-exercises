
public class BaseballPlayer {
	
	private String name;
	private int jerseyNum;
	private String battingStance;
	private int gamesPlayed;
	private int RBIs;
	private int runs;
	
	public BaseballPlayer(String name, int jerseyNum, String battingStance, int gamesPlayed, int RBIs, int runs)
	{
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.battingStance = battingStance;
		this.gamesPlayed = gamesPlayed;
		this.RBIs = RBIs;
		this.runs = runs;
	}
	
	public String toString()
	{
		return "Name: " + this.name + ", Jersey Number: " + this.jerseyNum + ", Batting Stance: " + this.battingStance + ", Games Played: " + this.gamesPlayed + ", Runs: " + this.runs + ", RBIs: " + this.RBIs;
	}
	
	public void gamePlayed(int addRBIs, int addRuns)
	{
		this.gamesPlayed = this.gamesPlayed + 1;
		this.runs = this.runs + addRuns;
		this.RBIs = this.RBIs + addRBIs;
		
	}
	

	public static void main(String[] args) {
		BaseballPlayer SammySossa = new BaseballPlayer("Sammy Sossa", 2, "Left", 0, 0, 0);
		System.out.println(SammySossa.toString());
		SammySossa.gamePlayed(4, 2);
		System.out.println(SammySossa.toString());

	}

}
