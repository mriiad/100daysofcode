package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author m-riad
 */
public class Solution_problem_4 {

    public static Integer oneOfThree(Integer b, Integer x, Integer y) {
	
	return b * x - (y * (b-1));
    }
    
    @Test
    public void TestCase1_equalsToX() {
	Integer x = new Integer(2);
	Integer y = new Integer(5);
	assertEquals(x, oneOfThree(1, x, y));
    }
    
    @Test
    public void TestCase1_equalsToY() {
	Integer x = new Integer(2);
	Integer y = new Integer(5);
	assertEquals(y, oneOfThree(0, x, y));
    }
}
