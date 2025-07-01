/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dr.saeedhamadalhassani
 */
public class Team { String name;
    String busyDates = new HashSet<>(); // Dates with other competitions

    public Team(String name) {
        this.name = name;
    }

    public boolean isBusy(String date) {
        return busyDates.contains(date);
    }

    public void addBusyDate(String date) {
        busyDates.add(date);
    }

    @Override
    public String toString() {
        return name;
    }
}
