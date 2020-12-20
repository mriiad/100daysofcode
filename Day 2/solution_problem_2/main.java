package main.problem_2;

public class Problem_2 {

    public static int countNumberOfUnivalSubTrees(UnivalTree univalTree) {
	
	if(univalTree == null) {
	    return 0;
	}else if(univalTree.left == null && univalTree.right == null) {
	    return 1; 
	}else if(univalTree.val == univalTree.left.val && univalTree.val == univalTree.right.val) {
	    return 1 + countNumberOfUnivalSubTrees(univalTree.left) + countNumberOfUnivalSubTrees(univalTree.right); 
	}else {
	    return countNumberOfUnivalSubTrees(univalTree.left) + countNumberOfUnivalSubTrees(univalTree.right);
	}
    }
    
    public static void main(String[] args) {
	/**
	 * Constructing the following tree
	   0
	   / \
	  1   0
	     / \
	    1   0
	   / \
	  1   1
	  */ 
	UnivalTree univalTree = new UnivalTree(0, 
		new UnivalTree(1, null, null), new UnivalTree(0,
					new UnivalTree(1, 
			new UnivalTree(1, null, null), new UnivalTree(1, null, null)), new UnivalTree(0, null, null)));
	System.out.println(countNumberOfUnivalSubTrees(univalTree));	
    }

}
