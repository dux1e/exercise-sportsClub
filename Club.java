
/**
 * Write a description of class Club here.
 *
 * @author Joakim Christensen  
 * @version 01-10-2020
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Club {
    // Instance Variables
    private ArrayList<Team> teams;

    // Constructor
    public Club() {
        this.teams = new ArrayList<>();
    }

    // Accessor Functions
    public ArrayList wonMoreGames() {
        ArrayList<Team> teamsWonMoreThanLost = new ArrayList<>();
        for(Team t : teams) {
            if(t.gamesWonGreaterThanLost() == true) {
                teamsWonMoreThanLost.add(t);
            }
        }
        return teamsWonMoreThanLost;
    }
    
    public Team findTeam(String name) {
        Iterator<Team> it = teams.iterator();
        boolean found = false;
        Team t = null;
        while(!found && it.hasNext()) {
            t = it.next();
            if(t.getMember(name).equals(name)) {
                found = true;
            }
        }
        return t;
    }
    
    // public Team findEldestTotal() {
        
    // }
    


    // Mutator Functions
    public void addTeams(Team team) {
        teams.add(team);
    }

    public void deleteTeam(String teamName) {
        Iterator<Team> it = teams.iterator();
        while(it.hasNext()) {
            Team t = it.next();
            if(t.getTeamName().equalsIgnoreCase(teamName)) {
                it.remove();
            }
        }
    }
}
