/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

/**
 *
 * @author ahmad
 */
public class LeagueMatch extends Matches implements Postpone {
     private String leagueName ;

    public LeagueMatch(String teamA, String teamB, String teamC, String teamD , String teamE , String teamF ,String teamG , String teamH, String date, String leagueName) {
        super(teamA, teamB,teamC, teamD, teamE, teamF, teamG, teamH, date);
        this.leagueName = leagueName;
    }

    private boolean postponed;

    @Override
    public boolean isPostponed() {
        return postponed;
    }

    @Override
    public void setPostponed(boolean status) {
        this.postponed = status;
    }

    public void displayInfo() {
        System.out.println("League: " + leagueName + " | " + getTeamA() + " vs " + getTeamB() + " on " + getDate() + " [" + getStatus() + "]");
    }  
}
 // use sustainability water usage lighting + wate + enargy 