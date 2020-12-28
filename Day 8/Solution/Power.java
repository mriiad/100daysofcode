package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Power {

    public static long pow(int x, int y) {
	int s = 1;

	for(int i = 0; i < y/2; i++) {
	    s *= x * x;
	}
	if(y % 2 > 0) {
	    s *= x;
	}
	return s;
    }
    
    public static long power(int x, int y) {
	   	
	// The naive solution
	long result = x;
	for (int i = 1; i < y; i++) { 
	    result = result * x; 
	}
	
	return result; 
    }
    
    @Test
    public void test_time1() {
	long startTime = System.nanoTime(); 
        assertEquals(1024, power(2, 10));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time elapsed using the naive solution: " + estimatedTime);
    }
    
    @Test
    public void test_time2() {
	long startTime = System.nanoTime(); 
        assertEquals(1024, pow(2, 10));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Time elapsed using the solution above: " + estimatedTime);
    }
    
    @Test
    public void test1() {
        assertEquals((long)Math.pow(2, 10), pow(2, 10));
    }
    
    @Test
    public void test2() {
        assertEquals((long)Math.pow(5, 7), pow(5, 7));
    }
}
