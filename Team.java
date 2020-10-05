
/**
 * Write a description of class Team here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Team {
    // Instance Variables
    private String teamName;
    private String sportsDiscipline;
    private int points;
    private int gamesLost;
    private int gamesWon;
    private ArrayList<Member> members;

    // Constructor
    public Team (String teamName, String sportsDiscipline, int points, int gamesLost, int gamesWon) {
        this.teamName = teamName;
        this.sportsDiscipline = sportsDiscipline;
        this.points = points;
        this.gamesLost = gamesLost;
        this.gamesWon = gamesWon;
        this.members = new ArrayList<>();
    }

    // Accessor Functions
    public String getTeamName() {
        return teamName;
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
        int maxIndex = 0;
        Member m = members.get(0);
        int maxAge = m.getAge();
        int i = 0;
        while(i < members.size()) {
            m = members.get(i);
            if(m.getAge() > maxAge) {
                maxAge = m.getAge();
                maxIndex = i;
            } else {
                i++;
            }
        }
        m = members.get(maxIndex);
        return m;
    }

    public int countMembers() {
        Iterator<Member> it = members.iterator();
        int count = 0;
        while(it.hasNext()) {
            Member m = it.next();
            count++;
        }
        return count;
    }

    public void getAges() {
        for(Member member : members) {
            member.getAge();
        }
    }

    public Member getMember(String memberName) {
        Iterator<Member> it = members.iterator();
        boolean found = false;
        Member m = null;
        while(!found && it.hasNext()) {
            m = it.next();
            if(m.getName().equalsIgnoreCase(memberName)) {
                found = true;
            }
        }
        return m;
    }

    public boolean gamesWonGreaterThanLost() {
        boolean GWGTL = false;
        if(getGamesWon() > getGamesLost()) {
            GWGTL = true;
        }
        return GWGTL;
    }

    // Mutator Functions
    public void setTeamname(String teamName) {
        this.teamName = teamName;
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
