package problem_66;

import java.util.Stack;

/**
 * @author m-riad
 */
public class SinglyLinkedList {

    public Node head;

    // Creating an empty linkedList
    public SinglyLinkedList() {
	this.head = null;
    }
    
    public void add(Node node) {
	if(head != null) {
	    Node p = head;
	    while(p.next != null) {
		p = p.next;
	    }
	    p.next = node;
	}else {
	    head = node;
	}
	node.next = null;
    }
    
    public boolean isPalindrome() {
	Stack<Integer> stack = new Stack<>();
	Node p = head;
	while(p != null) {
	    stack.push(p.val);
	    p = p.next;
	}
	p = head;
	while(p != null) {
	    if(p.val != stack.pop()) {
		return false;
	    }
	    p = p.next;
	}
	return true;
    }
}
