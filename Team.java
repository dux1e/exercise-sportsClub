
/**
 * Write a description of class Team here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Team {
    // Instance Variables
    private String teamname;
    private String sportsDiscipline;
    private int points;
    private int gamesLost;
    private int gamesWon;
    private ArrayList<Member> members;

    // Constructor
    public Team (String teamname, String sportsDiscipline, int points, int gamesLost, int gamesWon) {
        this.teamname = teamname;
        this.sportsDiscipline = sportsDiscipline;
        this.points = points;
        this.gamesLost = gamesLost;
        this.gamesWon = gamesWon;
        this.members = new ArrayList<>();
    }

    // Accessor Functions
    public String getTeamname() {
        return teamname;
    }

    public String getSportsDiscipline() {
        return sportsDiscipline;
    }

    public int getPoints() {
        return points;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void listMembers() {
        if(members.size() != 0) {
            for(Member member : members) {
                member.printInfo();
            }
        } else {
            System.out.println("The team has no members");
        }
    }

    public Member getEldestMember() {
        int i = 0;
        if(members.size() != 0) {
            for(Member member : members) {
                getAges();
            }
        } else {
            System.out.println("The team has no members");
        }
        return members.get(i);
    }

    public void getAges() {
        for(Member member : members) {
            member.getAge();
        }
    }

    // Mutator Functions
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public void setSportsDiscipline(String sportDiscipline) {
        this.sportsDiscipline = sportsDiscipline;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGamesLost(int gamesLost) {
        if(gamesLost < 0) {
            System.out.println("Games lost can't be less than 0");
        } else {
            this.gamesLost = gamesLost;
        }
    }

    public void setGamesWon(int gamesWon) {
        if(gamesWon < 0) {
            System.out.println("Games won can't be less than 0");
        } else {
            this.gamesWon = gamesWon;
        }
    }

    public void addMember(Member member) {
        members.add(member);
    }
}
