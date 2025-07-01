/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author dr.saeedhamadalhassani
 */
public interface Scheduler {
    List<Match> scheduleMatches(List<Team> teams);
}

// LeagueScheduler implementing Scheduler
class LeagueScheduler implements Scheduler {
    @Override
    public List<Match> scheduleMatches(List<Team> teams) {
        List<Match> matches = new ArrayList<>();
        int matchDay = 1;

        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                String date = "Day " + matchDay++;
                matches.add(new Match(teams.get(i), teams.get(j), date));
            }
        }
        return matches;
    }
    
}
