package matchpostpone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
     public Date getDateAsDate() throws ParseException {

            // Handle different date formats
            SimpleDateFormat format;
            if (date.contains("/")) {
                format = new SimpleDateFormat("dd/MM/yyyy");
            } else {
                format = new SimpleDateFormat("MM/dd/yyyy");
            }
            return format.parse(date);
        }

    public void postponeMatch() {
        this.status = "Postponed";
    }

    public abstract void display();

    @Override
    public String toString() {
        return teamA + " vs " + teamB + " on " + date + " " + status + ".";
    }
}
