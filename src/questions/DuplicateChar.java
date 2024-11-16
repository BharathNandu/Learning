package questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Date:10/11/2024
//WAP to find the duplicates in the string using 
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printduplicateCharacters("Java is a programming langauage");

	}

	public static void printduplicateCharacters(String s) {
		// here we are converting it into characterarray
		char[] charcters = s.toCharArray();

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		for (Character ch : charcters) {
			if (hs.containsKey(ch)) {
				hs.put(ch, hs.get(ch)+1);
				
			}else
			{
				hs.put(ch,1);
			}
		}
		// here we are iterating through the HashMap to print all the duplicates
		Set<Map.Entry<Character, Integer>> s1= hs.entrySet();
		System.out.println("List of duplicate characters in String "+s);
		for(Map.Entry<Character, Integer> entry : s1)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
		
		
	}
}
