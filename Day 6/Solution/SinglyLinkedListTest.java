package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author m-riad
 */
public class SinglyLinkedListTest {
    
    @Test
    public void testCase1_isPalindrome() {
	SinglyLinkedList sll = new SinglyLinkedList();
	sll.add(new Node(1));
	sll.add(new Node(3));
	sll.add(new Node(4));
	sll.add(new Node(3));
	sll.add(new Node(1));
	
	// Test
	assertEquals(true, sll.isPalindrome());
    }
    
    @Test
    public void testCase2_isPalindrome() {
	SinglyLinkedList sll = new SinglyLinkedList();
	sll.add(new Node(1));
	sll.add(new Node(3));
	sll.add(new Node(4));
	sll.add(new Node(4));
	sll.add(new Node(3));
	sll.add(new Node(4));
	sll.add(new Node(1));
	
	// Test
	assertEquals(false, sll.isPalindrome());
    }

}
