/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

/**
 *
 * @author PC
 */
public abstract class Matches {
    private String teamA;
    private String teamB;
    private String teamC;
    private String teamD;
    private String teamE;
    private String teamF;
    private String teamG;
    private String teamH;
    
    private String date;
    private String status; 

    public Matches(String teamA, String teamB, String teamC, String teamD, String teamE, String teamF, String teamG, String teamH, String date) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.teamC = teamC;
        this.teamD = teamD;
        this.teamE = teamE;
        this.teamF = teamF;
        this.teamG = teamG;
        this.teamH = teamH;
        
        
        this.date = date;
        this.status = "Scheduled";
    }

    public String getTeamA() {
        return teamA; 
    }
    public String getTeamB() {
        return teamB;
    }
    public String getTeamC() {
        return teamC;
        
    }
    public String getTeamD() {
        return teamD;
        
    }
    public String getTeamE() {
        return teamE;
        
    }
    public String getTeamF() {
        return teamF;
    }
    public String getTeamG() {
        return teamG;
    }
    public String getTeamH() {
        return teamH;
        
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
