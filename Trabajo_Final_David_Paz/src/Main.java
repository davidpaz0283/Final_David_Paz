import estadisticas.*;

import java.util.ArrayList;
import javax.swing.*;
import java.util.List;
public class Main {
    public static String [][] generatePlayer(){
        String[][] jugadores = new String[1][1];
        for(int i = 0; i < jugadores.length; i++){
            jugadores[i][0] = JOptionPane.showInputDialog("Por favor ingrese el nombre del jugador que usa la camiseta: " + (i+1));
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
                countries.get(4), countries.get(5))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(6), countries.get(7))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(4), countries.get(6))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(5), countries.get(7))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(4), countries.get(7))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(5), countries.get(6))
        );
        //Grupo C
        faseDeGruposMundial.addMatch(new Match(
                countries.get(8), countries.get(9))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(10), countries.get(11))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(8), countries.get(10))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(9), countries.get(11))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(8), countries.get(11))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(9), countries.get(10))
        );
        //Grupo D
        faseDeGruposMundial.addMatch(new Match(
                countries.get(12), countries.get(13))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(14), countries.get(15))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(12), countries.get(14))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(13), countries.get(15))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(12), countries.get(15))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(13), countries.get(14))
        );
        //Grupo E
        faseDeGruposMundial.addMatch(new Match(
                countries.get(16), countries.get(17))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(18), countries.get(19))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(16), countries.get(18))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(17), countries.get(19))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(16), countries.get(19))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(17), countries.get(18))
        );
        //Grupo F
        faseDeGruposMundial.addMatch(new Match(
                countries.get(20), countries.get(21))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(22), countries.get(23))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(20), countries.get(22))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(21), countries.get(23))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(20), countries.get(23))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(21), countries.get(22))
        );
        //Grupo G
        faseDeGruposMundial.addMatch(new Match(
                countries.get(24), countries.get(25))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(26), countries.get(27))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(24), countries.get(26))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(25), countries.get(27))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(24), countries.get(27))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(25), countries.get(26))
        );
        //Grupo H
        faseDeGruposMundial.addMatch(new Match(
                countries.get(28), countries.get(29))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(30), countries.get(31))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(28), countries.get(30))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(29), countries.get(31))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(28), countries.get(31))
        );
        faseDeGruposMundial.addMatch(new Match(
                countries.get(29), countries.get(30)
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

        Match faseDeGrupoB1 = faseDeGruposMundial.getMatches().get(6);
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementLocalGoals();
        faseDeGrupoB1.incrementVisitantGoals();
        faseDeGrupoB1.incrementVisitantGoals();

        Match faseDeGrupoB2 = faseDeGruposMundial.getMatches().get(7);
        faseDeGrupoB2.incrementLocalGoals();
        faseDeGrupoB2.incrementVisitantGoals();

        Match faseDeGrupoB3 = faseDeGruposMundial.getMatches().get(8);
        faseDeGrupoB3.incrementLocalGoals();
        faseDeGrupoB3.incrementVisitantGoals();

        Match faseDeGrupoB4 = faseDeGruposMundial.getMatches().get(9);
        faseDeGrupoB4.incrementVisitantGoals();
        faseDeGrupoB4.incrementVisitantGoals();

        Match faseDeGrupoB5 = faseDeGruposMundial.getMatches().get(10);
        faseDeGrupoB5.incrementLocalGoals();
        faseDeGrupoB5.incrementLocalGoals();
        faseDeGrupoB5.incrementLocalGoals();

        Match faseDeGrupoB6 = faseDeGruposMundial.getMatches().get(11);
        faseDeGrupoB6.incrementVisitantGoals();

        Match faseDeGrupoC1 = faseDeGruposMundial.getMatches().get(12);
        faseDeGrupoC1.incrementLocalGoals();
        faseDeGrupoC1.incrementVisitantGoals();
        faseDeGrupoC1.incrementVisitantGoals();

        Match faseDeGrupoC2 = faseDeGruposMundial.getMatches().get(13);
        faseDeGrupoC2.incrementLocalGoals();
        faseDeGrupoC2.incrementVisitantGoals();

        Match faseDeGrupoC3 = faseDeGruposMundial.getMatches().get(14);
        faseDeGrupoC3.incrementLocalGoals();
        faseDeGrupoC3.incrementLocalGoals();

        Match faseDeGrupoC4 = faseDeGruposMundial.getMatches().get(15);
        faseDeGrupoC4.incrementVisitantGoals();
        faseDeGrupoC4.incrementVisitantGoals();

        Match faseDeGrupoC5 = faseDeGruposMundial.getMatches().get(16);
        faseDeGrupoC5.incrementLocalGoals();
        faseDeGrupoC5.incrementLocalGoals();

        Match faseDeGrupoC6 = faseDeGruposMundial.getMatches().get(17);
        faseDeGrupoC6.incrementLocalGoals();
        faseDeGrupoC6.incrementVisitantGoals();
        faseDeGrupoC6.incrementVisitantGoals();

        Match faseDeGrupoD1 = faseDeGruposMundial.getMatches().get(18);
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementLocalGoals();
        faseDeGrupoD1.incrementVisitantGoals();

        Match faseDeGrupoD2 = faseDeGruposMundial.getMatches().get(19);
        faseDeGrupoD2.incrementLocalGoals();
        faseDeGrupoD2.incrementVisitantGoals();

        Match faseDeGrupoD3 = faseDeGruposMundial.getMatches().get(20);
        faseDeGrupoD3.incrementLocalGoals();
        faseDeGrupoD3.incrementLocalGoals();
        faseDeGrupoD3.incrementVisitantGoals();

        Match faseDeGrupoD4 = faseDeGruposMundial.getMatches().get(21);
        faseDeGrupoD4.incrementLocalGoals();

        Match faseDeGrupoD5 = faseDeGruposMundial.getMatches().get(22);
        faseDeGrupoD5.incrementVisitantGoals();

        Match faseDeGrupoD6 = faseDeGruposMundial.getMatches().get(23);
        faseDeGrupoD6.incrementLocalGoals();

        Match faseDeGrupoE1 = faseDeGruposMundial.getMatches().get(24);
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();
        faseDeGrupoE1.incrementLocalGoals();

        Match faseDeGrupoE2 = faseDeGruposMundial.getMatches().get(25);
        faseDeGrupoE2.incrementLocalGoals();
        faseDeGrupoE2.incrementVisitantGoals();
        faseDeGrupoE2.incrementVisitantGoals();

        Match faseDeGrupoE3 = faseDeGruposMundial.getMatches().get(26);
        faseDeGrupoE3.incrementLocalGoals();
        faseDeGrupoE3.incrementVisitantGoals();

        Match faseDeGrupoE4 = faseDeGruposMundial.getMatches().get(27);
        faseDeGrupoE4.incrementLocalGoals();

        Match faseDeGrupoE5 = faseDeGruposMundial.getMatches().get(28);
        faseDeGrupoE5.incrementLocalGoals();
        faseDeGrupoE5.incrementVisitantGoals();
        faseDeGrupoE5.incrementVisitantGoals();

        Match faseDeGrupoE6 = faseDeGruposMundial.getMatches().get(29);
        faseDeGrupoE6.incrementLocalGoals();
        faseDeGrupoE6.incrementLocalGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();
        faseDeGrupoE6.incrementVisitantGoals();

        Match faseDeGrupoF1 = faseDeGruposMundial.getMatches().get(30);
        faseDeGrupoF1.incrementLocalGoals();

        Match faseDeGrupoF2 = faseDeGruposMundial.getMatches().get(31);
        faseDeGrupoF2.incrementLocalGoals();
        faseDeGrupoF2.incrementVisitantGoals();

        Match faseDeGrupoF3 = faseDeGruposMundial.getMatches().get(32);
        faseDeGrupoF3.incrementVisitantGoals();
        faseDeGrupoF3.incrementVisitantGoals();

        Match faseDeGrupoF4 = faseDeGruposMundial.getMatches().get(33);
        faseDeGrupoF4.incrementLocalGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();
        faseDeGrupoF4.incrementVisitantGoals();

        Match faseDeGrupoF5 = faseDeGruposMundial.getMatches().get(34);
        faseDeGrupoF5.incrementLocalGoals();
        faseDeGrupoF5.incrementVisitantGoals();

        Match faseDeGrupoF6 = faseDeGruposMundial.getMatches().get(35);
        faseDeGrupoF6.incrementLocalGoals();
        faseDeGrupoF6.incrementVisitantGoals();
        faseDeGrupoF6.incrementVisitantGoals();

        Match faseDeGrupoG1 = faseDeGruposMundial.getMatches().get(36);
        faseDeGrupoG1.incrementLocalGoals();
        faseDeGrupoG1.incrementLocalGoals();

        Match faseDeGrupoG2 = faseDeGruposMundial.getMatches().get(37);
        faseDeGrupoG2.incrementLocalGoals();

        Match faseDeGrupoG3 = faseDeGruposMundial.getMatches().get(38);
        faseDeGrupoG3.incrementLocalGoals();

        Match faseDeGrupoG4 = faseDeGruposMundial.getMatches().get(39);
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementLocalGoals();
        faseDeGrupoG4.incrementVisitantGoals();
        faseDeGrupoG4.incrementVisitantGoals();
        faseDeGrupoG4.incrementVisitantGoals();

        Match faseDeGrupoG5 = faseDeGruposMundial.getMatches().get(40);
        faseDeGrupoG5.incrementVisitantGoals();

        Match faseDeGrupoG6 = faseDeGruposMundial.getMatches().get(41);
        faseDeGrupoG6.incrementLocalGoals();
        faseDeGrupoG6.incrementLocalGoals();
        faseDeGrupoG6.incrementVisitantGoals();
        faseDeGrupoG6.incrementVisitantGoals();
        faseDeGrupoG6.incrementVisitantGoals();

        Match faseDeGrupoH1 = faseDeGruposMundial.getMatches().get(42);
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementLocalGoals();
        faseDeGrupoH1.incrementVisitantGoals();
        faseDeGrupoH1.incrementVisitantGoals();

        Match faseDeGrupoH2 = faseDeGruposMundial.getMatches().get(43);
        faseDeGrupoH2.incrementLocalGoals();
        faseDeGrupoH2.incrementVisitantGoals();

        Match faseDeGrupoH3= faseDeGruposMundial.getMatches().get(44);
        faseDeGrupoH3.incrementLocalGoals();
        faseDeGrupoH3.incrementLocalGoals();

        Match faseDeGrupoH4= faseDeGruposMundial.getMatches().get(45);
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementLocalGoals();
        faseDeGrupoH4.incrementVisitantGoals();
        faseDeGrupoH4.incrementVisitantGoals();

        Match faseDeGrupoH5= faseDeGruposMundial.getMatches().get(46);
        faseDeGrupoH5.incrementLocalGoals();
        faseDeGrupoH5.incrementVisitantGoals();
        faseDeGrupoH5.incrementVisitantGoals();

        Match faseDeGrupoH6= faseDeGruposMundial.getMatches().get(47);
        faseDeGrupoH6.incrementVisitantGoals();
        faseDeGrupoH6.incrementVisitantGoals();

        Llave octavosDeFinalMundial = new Llave();

        octavosDeFinalMundial.setTeams(faseDeGruposMundial.getNextStepTeams());

        octavosDeFinalMundial.addTeam(new Team("Paises Bajos"));
        octavosDeFinalMundial.addTeam(new Team("EEUU"));

        octavosDeFinalMundial.addTeam(new Team("Argentina"));
        octavosDeFinalMundial.addTeam(new Team("Australia"));

        octavosDeFinalMundial.addTeam(new Team("Japon"));
        octavosDeFinalMundial.addTeam(new Team("Croacia"));

        octavosDeFinalMundial.addTeam(new Team("Brasil"));
        octavosDeFinalMundial.addTeam(new Team("Corea del Sur"));

        octavosDeFinalMundial.addTeam(new Team("Senegal"));
        octavosDeFinalMundial.addTeam(new Team("Inglaterra"));

        octavosDeFinalMundial.addTeam(new Team("Francia"));
        octavosDeFinalMundial.addTeam(new Team("Polonia"));

        octavosDeFinalMundial.addTeam(new Team("Marruecos"));
        octavosDeFinalMundial.addTeam(new Team("España"));

        octavosDeFinalMundial.addTeam(new Team("Portugal"));
        octavosDeFinalMundial.addTeam(new Team("Suiza"));


        octavosDeFinalMundial.addMatch(new Match(
                countries.get(3),
                countries.get(6))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(8),
                countries.get(13))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(19),
                countries.get(23))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(24),
                countries.get(31))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(2),
                countries.get(4))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(12),
                countries.get(11))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(22),
                countries.get(16))
        );
        octavosDeFinalMundial.addMatch(new Match(
                countries.get(26),
                countries.get(29)
        ));
        Match octavos1 = octavosDeFinalMundial.getMatches().get(0);
        octavos1.incrementLocalGoals();
        octavos1.incrementLocalGoals();
        octavos1.incrementLocalGoals();
        octavos1.incrementVisitantGoals();

        Match octavos2 = octavosDeFinalMundial.getMatches().get(1);
        octavos2.incrementLocalGoals();
        octavos2.incrementLocalGoals();
        octavos2.incrementVisitantGoals();

        Match octavos3 = octavosDeFinalMundial.getMatches().get(2);
        octavos3.incrementLocalGoals();
        octavos3.incrementLocalGoals();
        octavos3.incrementVisitantGoals();

        Match octavos4 = octavosDeFinalMundial.getMatches().get(3);
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementLocalGoals();
        octavos4.incrementVisitantGoals();

        Match octavos5 = octavosDeFinalMundial.getMatches().get(4);
        octavos5.incrementVisitantGoals();
        octavos5.incrementVisitantGoals();
        octavos5.incrementVisitantGoals();

        Match octavos6 = octavosDeFinalMundial.getMatches().get(5);
        octavos6.incrementLocalGoals();
        octavos6.incrementLocalGoals();
        octavos6.incrementLocalGoals();
        octavos6.incrementVisitantGoals();

        Match octavos7 = octavosDeFinalMundial.getMatches().get(6);
        octavos7.incrementLocalGoals();
        octavos7.incrementLocalGoals();
        octavos7.incrementVisitantGoals();

        Match octavos8 = octavosDeFinalMundial.getMatches().get(7);
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementLocalGoals();
        octavos8.incrementVisitantGoals();

        Llave cuartosDeFinalMundial = new Llave();

        cuartosDeFinalMundial.setTeams(octavosDeFinalMundial.getNextStepTeams());

        cuartosDeFinalMundial.addTeam(new Team("Croacia"));
        cuartosDeFinalMundial.addTeam(new Team("Brasil"));

        cuartosDeFinalMundial.addTeam(new Team("Paises Bajos"));
        cuartosDeFinalMundial.addTeam(new Team("Argentina"));

        cuartosDeFinalMundial.addTeam(new Team("Inglaterra"));
        cuartosDeFinalMundial.addTeam(new Team("Francia"));

        cuartosDeFinalMundial.addTeam(new Team("Marruecos"));
        cuartosDeFinalMundial.addTeam(new Team("Portugal"));


         cuartosDeFinalMundial.addMatch(new Match(
            countries.get(23),
                countries.get(24))
                        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(3),
                countries.get(8))
        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(4),
                countries.get(12))
        );
        cuartosDeFinalMundial.addMatch(new Match(
                countries.get(22),
                countries.get(29)
        ));

        Match cuartos1 = cuartosDeFinalMundial.getMatches().get(0);
        cuartos1.incrementLocalGoals();
        cuartos1.incrementLocalGoals();
        cuartos1.incrementLocalGoals();
        cuartos1.incrementLocalGoals();
        cuartos1.incrementLocalGoals();
        cuartos1.incrementVisitantGoals();
        cuartos1.incrementVisitantGoals();
        cuartos1.incrementVisitantGoals();

        Match cuartos2 = cuartosDeFinalMundial.getMatches().get(1);
        cuartos2.incrementLocalGoals();
        cuartos2.incrementLocalGoals();
        cuartos2.incrementLocalGoals();
        cuartos2.incrementLocalGoals();
        cuartos2.incrementLocalGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();
        cuartos2.incrementVisitantGoals();

        Match cuartos3 = cuartosDeFinalMundial.getMatches().get(2);
        cuartos3.incrementLocalGoals();
        cuartos3.incrementVisitantGoals();
        cuartos3.incrementVisitantGoals();

        Match cuartos4 = cuartosDeFinalMundial.getMatches().get(3);
        cuartos4.incrementLocalGoals();

        Llave semiFinalMundial = new Llave();

        semiFinalMundial.setTeams(cuartosDeFinalMundial.getNextStepTeams());

        semiFinalMundial.addTeam(new Team("Argentina"));
        semiFinalMundial.addTeam(new Team("Croacia"));

        semiFinalMundial.addTeam(new Team("Francia"));
        semiFinalMundial.addTeam(new Team("Marruecos"));


        semiFinalMundial.addMatch(new Match(
            countries.get(8),
                countries.get(23))
                        );
          semiFinalMundial.addMatch(new Match(
            countries.get(12),
                countries.get(22))
                        );

        Match semi1 = semiFinalMundial.getMatches().get(0);
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();
        semi1.incrementLocalGoals();

        Match semi2 = semiFinalMundial.getMatches().get(1);
        semi2.incrementLocalGoals();
        semi2.incrementLocalGoals();

        Llave fasefinalMundial = new Llave();

        fasefinalMundial.setTeams(semiFinalMundial.getNextStepTeams());

        fasefinalMundial.addMatch(new Match(
                countries.get(8),
                countries.get(12))
        );

        Match finalMatch = fasefinalMundial.getMatches().get(0);
        finalMatch.incrementLocalGoals();

        fasefinalMundial.getNextStepTeams().forEach(team -> {
            team.showPlayersList();

        });
        //Argentina Campeón!!!!
    }
}