package main;

/**
 * @author m-riad
 */
public class LinkedList {

    public Node head;
    public Node tail;

    // Creating an empty linkedList
    public LinkedList() {
	this.head = null;
	this.tail = null;
    }
    
    public void add(Node node) {
	if(head != null) {
	    tail.next = node;
	    tail = tail.next;
	}else {
	    head = node;
	    tail = node;
	}
	node.next = null;
    }
    
    public void connectToTail(int pos) {
	Node p = head;
	int i = 0;
	while(i != pos) {
	    i++;
	    p = p.next;
	}
	tail.next = p;
    }
    
    public boolean hasCycle() {
	if(tail.next != head) {
	    return true;
	}
	return false;
    }
}
