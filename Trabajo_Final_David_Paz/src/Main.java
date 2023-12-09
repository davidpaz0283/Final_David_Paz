import estadisticas.*;

import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
public class Main {
    public static String [][] generatePlayer(){
        String[][] jugadores = new String[11][11];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador que usa la camiseta: " + (i+1));
            jugadores[i][1] = JOptionPane.showInputDialog("Por favor ingrese la posición de: " + jugadores[i][0]);
        }
        return jugadores;
    }
    public static void main(String[] args) {

        Llave fasefinalMundial = new Llave();
        //La Gran Final!
        fasefinalMundial.addTeam(new Team("Argentina"));
        fasefinalMundial.addTeam(new Team("Francia"));

        ArrayList<Team> countries = fasefinalMundial.getTeams();

        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }
        fasefinalMundial.addMatch(new Match(
                fasefinalMundial.getTeams().get(0),
                fasefinalMundial.getTeams().get(1))
        );

        Match finalMatch = fasefinalMundial.getMatches().get(0);
        finalMatch.incrementLocalGoals();

        fasefinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();

        });
        //Argentina Campeón!!!!
    }
}