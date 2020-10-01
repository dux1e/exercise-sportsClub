

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestRig
{
    private Member member1;
    private Team team1;
    private Member member2;
    private Member member3;
    private Member member4;

    
    
    
    

    
    

    /**
     * Default constructor for test class TestRig
     */
    public TestRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        member1 = new Member(20, "Joakim", null, null);
        team1 = new Team("Doragon", "Explosion", 100, 0, 100);
        member2 = new Member(15, "Peter", null, null);
        member3 = new Member(17, "Christian", null, null);
        team1.addMember(member1);
        team1.addMember(member2);
        team1.addMember(member3);
        team1.listMembers();
        member4 = new Member(30, "Jacob", null, null);
        team1.addMember(member4);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
