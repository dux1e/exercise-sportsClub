
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

    public Member getEldesMember() {
        int maxi = 0;
        int i = 0;
        Team t = teams.get(0);
        int maxAge = t.getEldestMember().getAge();
        while(i < teams.size()) {
            t = teams.get(i);
            if(t.getEldestMember().getAge() > maxAge) {
                maxAge = t.getEldestMember().getAge();
                maxi = i;
            } else {
                i++;
            }
        }
        t = teams.get(maxi);
        Member m = t.getEldestMember();
        return m;
    }

    public Team findTeamByMemberName(String name) {
        Iterator<Team> it = teams.iterator();
        boolean found = false;
        Team t = null;
        while(!found && it.hasNext()) {
            t = it.next();
            if(t.getMember(name).getName().equals(name)) {
                found = true;
            }
        }
        return t;
    }


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
