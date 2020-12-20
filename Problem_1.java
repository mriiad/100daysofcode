/**
Problem 1:

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

import java.util.ArrayList;
import java.util.List;

public class Problem_1 {

    public static boolean equalsToK(List<Integer> numbers, int k) {
	for(int i = 0; i < numbers.size(); i++) {
	    for(int j = i + 1; j < numbers.size(); j++) {
		if(numbers.get(i) + numbers.get(j) == k) {
		    return true;
		}
	    }
	}
	return false;
    }
    public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<Integer>();
	numbers.add(10);
	numbers.add(15);
	numbers.add(3);
	numbers.add(7);
	System.out.println(equalsToK(numbers, 14));
    }

}
