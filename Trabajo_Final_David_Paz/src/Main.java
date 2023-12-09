import estadisticas.*;

import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
public class Main {
    public static String [][] generatePlayer(){
        String[][] jugadores = new String[3][3];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador: " + (i+1));
            jugadores[i][1] = JOptionPane.showInputDialog("Por favor ingrese la posición de: " + jugadores[i][0]);
        }
        return jugadores;
    }
    public static void main(String[] args) {

        Llave faseDeGruposMundial = new Llave();
        //Grupo A
        faseDeGruposMundial.addTeam(new Team("Qatar"));
        faseDeGruposMundial.addTeam(new Team("Ecuador"));

        faseDeGruposMundial.addTeam(new Team("Senegal"));
        faseDeGruposMundial.addTeam(new Team("Paises Bajos"));

        faseDeGruposMundial.addTeam(new Team("Qatar"));
        faseDeGruposMundial.addTeam(new Team("Senegal"));

        faseDeGruposMundial.addTeam(new Team("Ecuador"));
        faseDeGruposMundial.addTeam(new Team("Paises Bajos"));

        faseDeGruposMundial.addTeam(new Team("Qatar"));
        faseDeGruposMundial.addTeam(new Team("Paises Bajos"));

        faseDeGruposMundial.addTeam(new Team("Ecuador"));
        faseDeGruposMundial.addTeam(new Team("Senegal"));

        //Grupo B
        faseDeGruposMundial.addTeam(new Team("Inglaterra"));
        faseDeGruposMundial.addTeam(new Team("Iran"));

        faseDeGruposMundial.addTeam(new Team("EEUU"));
        faseDeGruposMundial.addTeam(new Team("Gales"));

        faseDeGruposMundial.addTeam(new Team("Inglaterra"));
        faseDeGruposMundial.addTeam(new Team("EEUU"));

        faseDeGruposMundial.addTeam(new Team("Iran"));
        faseDeGruposMundial.addTeam(new Team("Gales"));

        faseDeGruposMundial.addTeam(new Team("Inglaterra"));
        faseDeGruposMundial.addTeam(new Team("Gales"));

        faseDeGruposMundial.addTeam(new Team("Iran"));
        faseDeGruposMundial.addTeam(new Team("EEUU"));

        //Grupo C
        faseDeGruposMundial.addTeam(new Team("Argentina"));
        faseDeGruposMundial.addTeam(new Team("Arabia Saudita"));

        faseDeGruposMundial.addTeam(new Team("Mexico"));
        faseDeGruposMundial.addTeam(new Team("Polonia"));

        faseDeGruposMundial.addTeam(new Team("Argemtina"));
        faseDeGruposMundial.addTeam(new Team("Mexico"));

        faseDeGruposMundial.addTeam(new Team("Arabia Saudita"));
        faseDeGruposMundial.addTeam(new Team("Polonia"));

        faseDeGruposMundial.addTeam(new Team("Argentina"));
        faseDeGruposMundial.addTeam(new Team("Polonia"));

        faseDeGruposMundial.addTeam(new Team("Arabia Saudita"));
        faseDeGruposMundial.addTeam(new Team("Mexico"));

        //Grupo D
        faseDeGruposMundial.addTeam(new Team("Francia"));
        faseDeGruposMundial.addTeam(new Team("Australia"));

        faseDeGruposMundial.addTeam(new Team("Dinamarca"));
        faseDeGruposMundial.addTeam(new Team("Tunez"));

        faseDeGruposMundial.addTeam(new Team("Francia"));
        faseDeGruposMundial.addTeam(new Team("Dinamarca"));

        faseDeGruposMundial.addTeam(new Team("Australia"));
        faseDeGruposMundial.addTeam(new Team("Tunez"));

        faseDeGruposMundial.addTeam(new Team("Francia"));
        faseDeGruposMundial.addTeam(new Team("Tunez"));

        faseDeGruposMundial.addTeam(new Team("Australia"));
        faseDeGruposMundial.addTeam(new Team("Dinamarca"));

        //Grupo E
        faseDeGruposMundial.addTeam(new Team("España"));
        faseDeGruposMundial.addTeam(new Team("Costa Rica"));

        faseDeGruposMundial.addTeam(new Team("Alemania"));
        faseDeGruposMundial.addTeam(new Team("Japon"));

        faseDeGruposMundial.addTeam(new Team("España"));
        faseDeGruposMundial.addTeam(new Team("Alemania"));

        faseDeGruposMundial.addTeam(new Team("Costa Rica"));
        faseDeGruposMundial.addTeam(new Team("Japon"));

        faseDeGruposMundial.addTeam(new Team("España"));
        faseDeGruposMundial.addTeam(new Team("Japon"));

        faseDeGruposMundial.addTeam(new Team("Costa Rica"));
        faseDeGruposMundial.addTeam(new Team("Alemania"));

        //Grupo F
        faseDeGruposMundial.addTeam(new Team("Belgica"));
        faseDeGruposMundial.addTeam(new Team("Canada"));

        faseDeGruposMundial.addTeam(new Team("Marruecos"));
        faseDeGruposMundial.addTeam(new Team("Croacia"));

        faseDeGruposMundial.addTeam(new Team("Belgica"));
        faseDeGruposMundial.addTeam(new Team("Marruecos"));

        faseDeGruposMundial.addTeam(new Team("Canada"));
        faseDeGruposMundial.addTeam(new Team("Croacia"));

        faseDeGruposMundial.addTeam(new Team("Belgica"));
        faseDeGruposMundial.addTeam(new Team("Croacia"));

        faseDeGruposMundial.addTeam(new Team("Canada"));
        faseDeGruposMundial.addTeam(new Team("Marruecos"));

        //Grupo G
        faseDeGruposMundial.addTeam(new Team("Brasil"));
        faseDeGruposMundial.addTeam(new Team("Serbia"));

        faseDeGruposMundial.addTeam(new Team("Suiza"));
        faseDeGruposMundial.addTeam(new Team("Camerun"));

        faseDeGruposMundial.addTeam(new Team("Brasil"));
        faseDeGruposMundial.addTeam(new Team("Suiza"));

        faseDeGruposMundial.addTeam(new Team("Serbia"));
        faseDeGruposMundial.addTeam(new Team("Camerun"));

        faseDeGruposMundial.addTeam(new Team("Brasil"));
        faseDeGruposMundial.addTeam(new Team("Camerun"));

        faseDeGruposMundial.addTeam(new Team("Serbia"));
        faseDeGruposMundial.addTeam(new Team("Suiza"));

        //Grupo H
        faseDeGruposMundial.addTeam(new Team("Portugal"));
        faseDeGruposMundial.addTeam(new Team("Ghana"));

        faseDeGruposMundial.addTeam(new Team("Uruguay"));
        faseDeGruposMundial.addTeam(new Team("Corea del Sur"));

        faseDeGruposMundial.addTeam(new Team("Portugal"));
        faseDeGruposMundial.addTeam(new Team("Uruguay"));

        faseDeGruposMundial.addTeam(new Team("Ghana"));
        faseDeGruposMundial.addTeam(new Team("Corea del Sur"));

        faseDeGruposMundial.addTeam(new Team("Portugal"));
        faseDeGruposMundial.addTeam(new Team("Corea del Sur"));

        faseDeGruposMundial.addTeam(new Team("Ghana"));
        faseDeGruposMundial.addTeam(new Team("Uruguay"));

        ArrayList<Team> countries = faseDeGruposMundial.getTeams();

        for (int j = 0; j < countries.size(); j++) {
            JOptionPane.showMessageDialog(null, "Vamos a cargar los jugadores de : " + countries.get(j).getName());
            String[][] jugadores = generatePlayer();
            for (int i = 0; i < jugadores.length; i++) {
                new Player(jugadores[i][0], i + 1, jugadores[i][1], countries.get(j));
            }
        }
        //Grupo A
         faseDeGruposMundial.addMatch(new Match(
                 countries.get(0), countries.get(1)) //Primer partido del Mundial!!
         );
        faseDeGruposMundial.addMatch(new Match(
        countries.get(2), countries.get(3))
         );
        faseDeGruposMundial.addMatch(new Match(
        countries.get(0), countries.get(2))
         );
        faseDeGruposMundial.addMatch(new Match(
        countries.get(1), countries.get(3))
         );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo B
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1)) 
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo C
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo D
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo E
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo F
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo G
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2))
        );

        //Grupo H
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(1))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(2), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(2))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(0), countries.get(3))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(1), countries.get(2)
        ));

        Match faseDeGrupoA1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoA1.incrementVisitantGoals();
        faseDeGrupoA1.incrementVisitantGoals();

        Match faseDeGrupoA2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoA2.incrementVisitantGoals();
        faseDeGrupoA2.incrementVisitantGoals();

        Match faseDeGrupoA3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoA3.incrementLocalGoals();
        faseDeGrupoA3.incrementVisitantGoals();
        faseDeGrupoA3.incrementVisitantGoals();
        faseDeGrupoA3.incrementVisitantGoals();

        Match faseDeGrupoA4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoA4.incrementLocalGoals();
        faseDeGrupoA4.incrementVisitantGoals();

        Match faseDeGrupoA5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoA5.incrementVisitantGoals();
        faseDeGrupoA5.incrementVisitantGoals();

        Match faseDeGrupoA6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoA6.incrementLocalGoals();
        faseDeGrupoA6.incrementVisitantGoals();
        faseDeGrupoA6.incrementVisitantGoals();

        Match faseDeGrupoB1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementVisitantGoals();
        faseDeGrupoB1.incrementVisitantGoals();

        Match faseDeGrupoB2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoB2.incrementLocalGoals();
        faseDeGrupoB2.incrementVisitantGoals();

        Match faseDeGrupoB3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoB3.incrementLocalGoals();
        faseDeGrupoB3.incrementVisitantGoals();

        Match faseDeGrupoB4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoB4.incrementVisitantGoals();
        faseDeGrupoB4.incrementVisitantGoals();

        Match faseDeGrupoB5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoB5.incrementLocalGoals();
        faseDeGrupoB5.incrementLocalGoals();
        faseDeGrupoB5.incrementLocalGoals();

        Match faseDeGrupoB6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoB6.incrementVisitantGoals();

        Match faseDeGrupoC1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoC1.incrementLocalGoals();
        faseDeGrupoC1.incrementVisitantGoals();
        faseDeGrupoC1.incrementVisitantGoals();

        Match faseDeGrupoC2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoC2.incrementLocalGoals();
        faseDeGrupoC2.incrementVisitantGoals();

        Match faseDeGrupoC3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoC3.incrementLocalGoals();
        faseDeGrupoC3.incrementLocalGoals();

        Match faseDeGrupoC4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoC4.incrementVisitantGoals();
        faseDeGrupoC4.incrementVisitantGoals();

        Match faseDeGrupoC5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoC5.incrementLocalGoals();
        faseDeGrupoC5.incrementLocalGoals();

        Match faseDeGrupoC6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoC6.incrementLocalGoals();
        faseDeGrupoC6.incrementVisitantGoals();
        faseDeGrupoC6.incrementVisitantGoals();

        Match faseDeGrupoD1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementVisitantGoals();

        Match faseDeGrupoD2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoD2.incrementLocalGoals();
        faseDeGrupoD2.incrementVisitantGoals();

        Match faseDeGrupoD3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoD3.incrementLocalGoals();
        faseDeGrupoD3.incrementLocalGoals();
        faseDeGrupoD3.incrementVisitantGoals();

        Match faseDeGrupoD4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoD4.incrementLocalGoals();

        Match faseDeGrupoD5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoD5.incrementVisitantGoals();

        Match faseDeGrupoD6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoD6.incrementLocalGoals();

        Match faseDeGrupoE1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();

        Match faseDeGrupoE2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoE2.incrementLocalGoals();
        faseDeGrupoE2.incrementVisitantGoals();
        faseDeGrupoE2.incrementVisitantGoals();

        Match faseDeGrupoE3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoE3.incrementLocalGoals();
        faseDeGrupoE3.incrementVisitantGoals();

        Match faseDeGrupoE4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoE4.incrementLocalGoals();

        Match faseDeGrupoE5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoE5.incrementLocalGoals();
        faseDeGrupoE5.incrementVisitantGoals();
        faseDeGrupoE5.incrementVisitantGoals();

        Match faseDeGrupoE6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoE6.incrementLocalGoals();
        faseDeGrupoE6.incrementLocalGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();

        Match faseDeGrupoF1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoF1.incrementLocalGoals();

        Match faseDeGrupoF2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoF2.incrementLocalGoals();
        faseDeGrupoF2.incrementVisitantGoals();

        Match faseDeGrupoF3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoF3.incrementVisitantGoals();
        faseDeGrupoF3.incrementVisitantGoals();

        Match faseDeGrupoF4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoF4.incrementLocalGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();

        Match faseDeGrupoF5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoF5.incrementLocalGoals();
        faseDeGrupoF5.incrementVisitantGoals();

        Match faseDeGrupoF6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoF6.incrementLocalGoals();
        faseDeGrupoF6.incrementVisitantGoals();
        faseDeGrupoF6.incrementVisitantGoals();

        Match faseDeGrupoG1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoG1.incrementLocalGoals();
        faseDeGrupoG1.incrementLocalGoals();

        Match faseDeGrupoG2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoG2.incrementLocalGoals();

        Match faseDeGrupoG3 = faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoG3.incrementLocalGoals();

        Match faseDeGrupoG4 = faseDeGruposMundial.getMatches().get(3);
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementVisitantGoals();
        faseDeGrupoG4.incrementVisitantGoals();
        faseDeGrupoG4.incrementVisitantGoals();

        Match faseDeGrupoG5 = faseDeGruposMundial.getMatches().get(4);
        faseDeGrupoG5.incrementVisitantGoals();

        Match faseDeGrupoG6 = faseDeGruposMundial.getMatches().get(5);
        faseDeGrupoG6.incrementLocalGoals();
        faseDeGrupoG6.incrementLocalGoals();
        faseDeGrupoG6.incrementVisitantGoals();
        faseDeGrupoG6.incrementVisitantGoals();
        faseDeGrupoG6.incrementVisitantGoals();

        Match faseDeGrupoH1 = faseDeGruposMundial.getMatches().get(0);
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementVisitantGoals();
        faseDeGrupoH1.incrementVisitantGoals();

        Match faseDeGrupoH2 = faseDeGruposMundial.getMatches().get(1);
        faseDeGrupoH2.incrementLocalGoals();
        faseDeGrupoH2.incrementVisitantGoals();

        Match faseDeGrupoH3= faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoH3.incrementLocalGoals();
        faseDeGrupoH3.incrementLocalGoals();

        Match faseDeGrupoH4= faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementVisitantGoals();
        faseDeGrupoH4.incrementVisitantGoals();

        Match faseDeGrupoH5= faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoH5.incrementLocalGoals();
        faseDeGrupoH5.incrementVisitantGoals();
        faseDeGrupoH5.incrementVisitantGoals();

        Match faseDeGrupoH6= faseDeGruposMundial.getMatches().get(2);
        faseDeGrupoH6.incrementVisitantGoals();
        faseDeGrupoH6.incrementVisitantGoals();

        //Puntos Finales Grupo A
        Team PaisesBajos = new Team("Paises Bajos", 5, 7);
        Team Senegal = new Team("Senegal", 5, 6);
        Team Ecuador = new Team("Ecuador", 4, 4);
        Team Qatar = new Team("Qatar", 1, 0);

        //Puntos Finales Grupo B
        Team Inglaterra = new Team("Inglaterra", 9, 7);
        Team EEUU = new Team("EEUU", 2, 5);
        Team Iran = new Team("Iran", 4, 3);
        Team Gales = new Team("Gales", 1, 1);

        //Puntos Finales Grupo C
        Team Argentina = new Team("Argentina", 5, 6);
        Team Polonia = new Team("Polonia", 2, 4);
        Team Mexico = new Team("Mexico", 2, 4);
        Team ArabiaSaudita = new Team("Arabia Saudita", 3, 3);

        //Puntos Finales Grupo D
        Team Francia = new Team("Francia", 6, 6);
        Team Australia = new Team("Australia", 3, 6);
        Team Tunez = new Team("Tunez", 1, 4);
        Team Dinamarca = new Team("Dinamarca", 1, 1);

        //Puntos Finales Grupo E
        Team Japon = new Team("Japon", 4, 6);
        Team España = new Team("España", 9, 4);
        Team Alemania = new Team("Alemania", 6, 4);
        Team CostaRica = new Team("Costa Rica", 3, 3);

        //Puntos Finales Grupo F
        Team Marruecos = new Team("Marruecos", 4, 7);
        Team Croacia = new Team("Croacia", 4, 5);
        Team Belgica = new Team("Belgica", 1, 4);
        Team Canada = new Team("Canada", 2, 0);

        //Puntos Finales Grupo G
        Team Brasil = new Team("Brasil", 3, 6);
        Team Suiza = new Team("Suiza", 4, 6);
        Team Camerun = new Team("Camerun", 4, 4);
        Team Serbia = new Team("Serbia", 5, 1);

        //Puntos Finales Grupo H
        Team Portugal = new Team("Portugal", 6, 6);
        Team CoreaDelSur = new Team("Corea Del Sur", 4, 4);
        Team Uruguay = new Team("Uruguay", 2, 4);
        Team Ghana = new Team("Ghana", 5, 3);

        faseDeGruposMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();
        });
    }
}