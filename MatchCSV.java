/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatchCSV {
    public static ArrayList<Matches> readMatchesFromCSV(String filename) {
        ArrayList<Matches> matches = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("teamA")) continue; // Skip header
                String[] data = line.split(",");
                if (data.length < 3) continue;

                String teamA = data[0].trim();
                String teamB = data[1].trim();
                String teamC = data[2].trim();
                String teamD = data[3].trim();
                String teamE = data[4].trim();
                String teamF = data[5].trim();
                String teamG = data[6].trim();
                String teamH = data[7].trim();
                
                String date = data[8].trim();

                
                Matches match = new LeagueMatch(teamA, teamB, teamC ,teamD , teamE ,teamF ,teamG , teamH, date, "Premier League");
                matches.add(match);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matches;
    }
}
