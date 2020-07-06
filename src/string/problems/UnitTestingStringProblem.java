package string.problems;

import java.util.Arrays;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this packag
    	Anagram anagram=new Anagram();
    	boolean isAnagram=anagram.isAnagram("cat", "act");
    	boolean answer=true;
    	try {
         	Assert.assertEquals(isAnagram, answer,"Not an anagram");
          }catch(Exception ex) {
         	 ex.getMessage();
          }
    
    	
    
    
    
    
    }
    
}
