package matchpostpone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MatchCSV {
    public static ArrayList<Matches> readfromCSV(String filename) {
        ArrayList<Matches> matches = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("teamA")) continue; // Skip header
                String[] data = line.split(",");
                if (data.length < 3) continue;

                String teamA = data[0].trim();
                String teamB = data[1].trim();
                String date = data[2].trim();

                Matches match = new LeagueMatch(teamA, teamB, date, "Premier League");
                matches.add(match);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        return matches;
    }
}
