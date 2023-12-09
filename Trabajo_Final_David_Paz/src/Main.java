import estadisticas.Match;
import estadisticas.Player;

import estadisticas.Season;
import estadisticas.Team;

import java.util.ArrayList;
import javax.swing.*;
public class Main {
    public static String [][] generatePlayer(){
        String[][] jugadores = new String[2][2];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador que usa la camiseta: " + i+1);
            jugadores[i][1] = JOptionPane.showInputDialog("Por favor ingrese la posición de: " + jugadores[i][0]);
        }
        return jugadores;
    }
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();
        Team argentina = new Team("Argentina", 0, 0);
        Team francia = new Team("Francia", 0, 0);

        faseGrupoMundial.addTeam(argentina);
        faseGrupoMundial.addTeam(francia);

        Player fideo = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player pulga = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);
        Player taglia = new Player("Nicolas Tagliafico", 3, "Defensor", argentina);
        Player dePaul = new Player("Rodrigo De Paul", 8, "Medio Campista", argentina);
        String[][] jugadoresArgentina = generatePlayer();
        String[][] jugadoresFrancia = generatePlayer();


        Player mbappe = new Player("Kylian Mbappe", 7, "Delantero", francia);
        Player griezman = new Player("Antoine Griezman", 7, "Delantero", francia);
        Player lloris = new Player("Hugo Lloris", 1, "Arquero", francia);
        for(int i = 0; i < jugadoresArgentina.length; i++){
            new Player(jugadoresArgentina[i][0], i+1, jugadoresArgentina[i][1], argentina);
        }
        for(int i = 0; i < jugadoresFrancia.length; i++){
            new Player(jugadoresFrancia[i][0], i+1, jugadoresFrancia[i][1], francia);
        }


        argentina.showPlayersList();

        Match finalMatch = new Match(argentina, francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();
    }
}