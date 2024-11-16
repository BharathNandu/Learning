package questions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram("triangle", "integral");

	}

	public static boolean anagram(String word, String anagram) {
		if (word.length() != anagram.length()) {

			System.out.println("the worlds are not angaram");
			return false;
		} else {
			char[] wordschar = word.toCharArray();
			char[] anagramchar = anagram.toCharArray();
			Arrays.sort(wordschar);
			Arrays.sort(anagramchar);

			Arrays.equals(wordschar, anagramchar);

			System.out.println("the words are angaram");
			return true;
		}
	}
}
