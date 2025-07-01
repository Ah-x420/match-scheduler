/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dr.saeedhamadalhassani
 */
public class Match {
    Team team1;
    Team team2;
    String date;

    public Match(Team team1, Team team2, String date) {
        this.team1 = team1;
        this.team2 = team2;
        this.date = date;
    }

    public boolean needsPostponement() {
        return team1.isBusy(date) || team2.isBusy(date);
    }

    @Override
    public String toString() {
        return team1 + " vs " + team2 + " on " + date + (needsPostponement() ? " [Postponed]" : "");
    }
    
}
