import estadisticas.Match;
import estadisticas.Player;

import estadisticas.Season;
import estadisticas.Team;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Season faseGrupoMundial = new Season();
        Team argentina = new Team("Argentina", 2, 3);
        Team francia = new Team("Francia", 1, 0);

        faseGrupoMundial.addTeam(argentina);
        faseGrupoMundial.addTeam(francia);

        Player fideo = new Player("Angel Di Maria", 7, "Delantero", argentina);
        Player pulga = new Player("Lionel Messi", 10, "Delantero", argentina);
        Player dibu = new Player("Emiliano Martinez", 1, "Arquero", argentina);
        Player taglia = new Player("Nicolas Tagliafico", 3, "Defensor", argentina);
        Player dePaul = new Player("Rodrigo De Paul", 8, "Medio Campista", argentina);

        System.out.println(pulga.getTeam().getName());

        Player mbappe = new Player("Kylian Mbappe", 7, "Delantero", francia);
        Player griezman = new Player("Antoine Griezman", 7, "Delantero", francia);
        Player lloris = new Player("Hugo Lloris", 1, "Arquero", francia);

        argentina.showPlayersList();

        Match finalMatch = new Match(argentina, francia);

        finalMatch.incrementLocalGoals();
        finalMatch.incrementVisitantGoals();
        finalMatch.incrementLocalGoals();
    }
}