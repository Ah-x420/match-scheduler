package matchpostpone;

public class LeagueMatch extends Matches implements Postpone{
    private String leagueName;

    public LeagueMatch(String teamA, String teamB, String date, String leagueName) {
        super(teamA, teamB, date);
        this.leagueName = leagueName;
    }

    public void postp() {
        postponeMatch();
    }

    public void display() {
        System.out.println("League: " + leagueName + " | " + getTeamA() + " vs " + getTeamB() + " on " + getDate() + " [" + getStatus() + "]");
    }
}
