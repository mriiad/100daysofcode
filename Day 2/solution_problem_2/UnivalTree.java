package main.problem_2;

/**
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
Given the root to a binary tree, count the number of unival subtrees.
For example, the following tree has 5 unival subtrees:
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1

 * @author m-riad
 */
public class UnivalTree {
    public int val;
    public UnivalTree left; 
    public UnivalTree right;

    public UnivalTree(int val, UnivalTree left, UnivalTree right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
