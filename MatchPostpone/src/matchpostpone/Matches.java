package matchpostpone;


public abstract class Matches {
    private String teamA;
    private String teamB;
    private String date;
    private String status; 

    public Matches(String teamA, String teamB, String date) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.date = date;
        this.status = "Scheduled";
    }

    public String getTeamA() {
        return teamA; 
    }
    public String getTeamB() {
        return teamB;
    }
    public String getDate() { 
        return date; 
    }
    public String getStatus() { 
        return status;
    }

    public void postponeMatch() {
        this.status = "Postponed";
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return teamA + " vs " + teamB + " on " + date + " " + status + ".";
    }
}
