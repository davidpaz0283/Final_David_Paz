// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import estadisticas.Player;
import estadisticas.Team;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Team argentina = new Team("Argentina", 2, 3);

        Player messi = new Player("Lionel Messi", 10, "Delantero", argentina);

        System.out.println(messi.getTeam().getName());
    }
}