package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
       // Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
       String wordNLnegth=findTheLargestWord(s);
    }

    public static String findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        
            String[] array = wordGiven.split(" ");
            Integer number=0;
            for (String s:array) {
            	
            	map.put(number, s);
            	
            }
            Set<Map.Entry<Integer,String>> entrySet= map.entrySet();
           int count=0;
            String maxWord="";
            Iterator iterator=entrySet.iterator();
            while(iterator.hasNext()){
            	String word;
            	word=iterator.next().toString();
            	if(word.length()>count)
            		maxWord=word;
            		
            		
            	
            	
            }
            
            return maxWord;
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
