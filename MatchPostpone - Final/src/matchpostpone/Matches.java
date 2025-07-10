package matchpostpone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


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
    
public boolean should_Postpone(Date otherDate) {
    try {
        Date thisDate = getDateAsDate();
        long diff = Math.abs(thisDate.getTime() - otherDate.getTime());
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) < 5;
    } 
    catch (Exception e) {
        return false;
    }
}

    public void postponeMatch() {
        this.status = "Postponed";
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

    public abstract void display();

    @Override
    public String toString() {
        return teamA + " vs " + teamB + " on " + date + " " + status + ".";
    }

    void setStatus(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
