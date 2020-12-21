package main;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author m-riad
 *
 */
public class Solution_AlgoExpert_Problem_3 {

    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	
	if(array.size() < sequence.size()){
	    return false;
	}
	int j = 0;
	for(int i = 0; i < array.size() && j < sequence.size(); i++){
	    if(sequence.get(j) == array.get(i)){
		j++;
	    }
	}
	if(j == sequence.size()){
		return true;
	}
	return false;
    }
    
    @Test
    public void TestCase1() {
	List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 1);
	List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 1);
	assertEquals(true, isValidSubsequence(array, sequence));
    }
    
    @Test
    public void TestCase2() {
	List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
	List<Integer> sequence = Arrays.asList(5, 1, 25, 22, 6, -1, 8, 10);
	assertEquals(false, isValidSubsequence(array, sequence));
    }
    
    @Test
    public void TestCase3() {
	List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
	List<Integer> sequence = Arrays.asList(5, 1, 22, 10);
	assertEquals(true, isValidSubsequence(array, sequence));
    }
    
    @Test
    public void TestCase4() {
	List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
	List<Integer> sequence = Arrays.asList(1, 6, -1, -1);
	assertEquals(false, isValidSubsequence(array, sequence));
    }
    
    @Test
    public void TestCase5() {
	List<Integer> array = Arrays.asList(1, 25, 6, -1, 10);
	List<Integer> sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
	assertEquals(false, isValidSubsequence(array, sequence));
    }
}
