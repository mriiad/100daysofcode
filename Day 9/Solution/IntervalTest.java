package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntervalTest {

    public boolean overlapping(int startOfInterval, Interval interval) {
	if(startOfInterval >= interval.start && startOfInterval <= interval.end) {
	    return true;
	}
	return false;
    }
    
    public int countRooms(Interval[] intervals) {
	int numberOfRooms = 0;
	for(int i = 0; i < intervals.length; i++) {
	    for(Interval interval : intervals) {
		if(intervals[i] != interval) {
		    if(overlapping(intervals[i].start, interval)) {
			numberOfRooms++;
		    }
		}
	    }
	}
	return numberOfRooms;
    }
    
    @Test
    public void testCase1() {
	Interval[] intervals = {new Interval(30, 75), new Interval(0, 50), new Interval(60, 150)};
	assertEquals(2, countRooms(intervals));
    }
    
    @Test
    public void testCase2() {
	Interval[] intervals = {new Interval(30, 75), new Interval(0, 50), new Interval(40, 150)};
	assertEquals(3, countRooms(intervals));
    }
    
    @Test
    public void testCase3() {
	Interval[] intervals = {new Interval(0, 50), new Interval(51, 90), new Interval(91, 150)};
	assertEquals(0, countRooms(intervals));
    }
}
