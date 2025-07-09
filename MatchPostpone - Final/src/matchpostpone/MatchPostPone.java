/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MatchPostPone {


    public static void main(String[] args) {
             // Step 1: Load matches from CSV
        ArrayList<Matches> matches = MatchCSV.readfromCSV("Football_Tournament_Schedule_8_Teams.csv");

        // Step 2: Display original matches
        System.out.println("=== Original Match Schedule ===");
        for (Matches match : matches) {
            match.display();
        }

        // Step 3: Postpone all matches before September
        for (Matches match : matches) {
            String month = match.getDate().split("-")[1]; // Extract month
            int monthNum = Integer.parseInt(month);
            if (monthNum < 9) { // Before September
                ((Postpone) match).postp(); // Postpone via interface
            }
        }

        // Step 4: Display updated match list
        System.out.println("\n=== Updated Match Schedule (Postponed for Sustainability) ===");
        for (Matches match : matches) {
            match.display();
        }
    }
}