/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchpostpone;

/**
 *
 * @author ahmad
 */
public class LeagueMatch extends Matches implements Postpone{
    private String leagueName;

    public LeagueMatch(String teamA, String teamB, String date, String leagueName) {
        super(teamA, teamB, date);
        this.leagueName = leagueName;
    }

    public void postp() {
        postponeMatch();
    }

    public void displayInfo() {
        System.out.println("League: " + leagueName + " | " + getTeamA() + " vs " + getTeamB() + " on " + getDate() + " [" + getStatus() + "]");
    }
}
