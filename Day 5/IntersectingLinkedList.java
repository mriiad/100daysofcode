package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntersectingLinkedList {
    
    public int lengthOfList(LinkedList l) {
	int count = 0;
	while(l != null) {
	    count++;
	    l = l.next;
	}
	return count;
    }
    public int intersectionNode(LinkedList l1, LinkedList l2) {
	int length_l1 = lengthOfList(l1);
	int length_l2 = lengthOfList(l2);
	if(length_l1 < length_l2) {
	    while((length_l2 - length_l1) > 0) {
		length_l2--;
		l2 = l2.next;
	    }
	}else {
	    while((length_l1 - length_l2) > 0) {
		length_l1--;
		l1 = l1.next;
	    }
	}
	while(l1 != null && l1.val != l2.val) {
	    l1 = l1.next;
	    l2 = l2.next;
	}
	return l1 != null ? l1.val : -1;
    }
    
    @Test
    public void TestCase1_equalsToSharedNode1() {
	
	LinkedList intersectedList = new LinkedList(8, new LinkedList(10, null));
	LinkedList l1 = new LinkedList(3, new LinkedList(7, intersectedList));
	LinkedList l2 = new LinkedList(99, new LinkedList(5, new LinkedList(1,intersectedList)));

	assertEquals(8, intersectionNode(l1, l2));
    }
    
    @Test
    public void TestCase1_equalsToSharedNode2() {
	
	LinkedList intersectedList = new LinkedList(8, new LinkedList(10, null));
	LinkedList l2 = new LinkedList(3, new LinkedList(7, intersectedList));
	LinkedList l1 = new LinkedList(99, new LinkedList(5, new LinkedList(1, intersectedList)));

	assertEquals(8, intersectionNode(l1, l2));
    }
    
    @Test
    public void TestCase1_noSharedNode() {
	
	LinkedList l1 = new LinkedList(3, new LinkedList(7, new LinkedList(8, new LinkedList(10, null))));
	LinkedList l2 = new LinkedList(99, new LinkedList(5, new LinkedList(1, null)));

	assertEquals(-1, intersectionNode(l1, l2));
    }
}
