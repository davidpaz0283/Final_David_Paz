package estadisticas;

import  java.util.ArrayList;
import  java.util.Date;
public abstract class Season {
    private String name;
    private Date startDate;
    private Date finishDate;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    public Season(){
        setTeams(new ArrayList<Team>());
        setMatches(new ArrayList<Match>());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }
    public void addTeam(Team team){
        getTeams().add(team);
    }
    public void removeTeam(Team team){
    }
    public ArrayList<Team> getTeams() {
        return teams;
    }
    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void addMatch(Match match){
        getMatches().add(match);
    }
    public void removeMatch(Match match){
    }
    public ArrayList<Match> getMatches() {
        return matches;
    }
    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
    abstract public ArrayList<Team> getNextStepTeams();
}