/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matchpostpone;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class MatchPostPone {


    public static void main(String[] args) throws IOException {

        ArrayList<Matches> matches = MatchCSV.readfromCSV("matches.csv");

        System.out.println("Original Match Schedule");
        for (Matches match : matches) {
            match.display();
        }

        for (Matches match : matches) {
            String month = match.getDate().split("-")[1]; 
            int monthNum = Integer.parseInt(month);
            if (monthNum < 9) { 
                ((Postpone) match).postp(); 
            }
            
        }

        System.out.println("\n Updated Match Schedule (Postponed for Sustainability)");
        for (Matches match : matches) {
            match.display();
        }
    }
}