package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author m-riad
 */
public class LinkedListTest {

    @Test
    public void testCase1_hadCycle() {
	LinkedList sll = new LinkedList();
	sll.add(new Node(4));
	sll.add(new Node(3));
	sll.add(new Node(2));
	sll.add(new Node(1));
	sll.add(new Node(0));
	sll.connectToTail(1);
	
	// Test
	assertEquals(true, sll.hasCycle());
    }
    
    @Test
    public void testCase2_withoutCycle() {
	LinkedList sll = new LinkedList();
	sll.add(new Node(4));
	sll.add(new Node(3));
	sll.add(new Node(2));
	sll.add(new Node(1));
	sll.add(new Node(0));
	sll.connectToTail(0);
	
	// Test
	assertEquals(false, sll.hasCycle());
    }
}
