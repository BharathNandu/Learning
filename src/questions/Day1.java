package questions;

public class Day1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " java is a programing language";
		revesestring(str);
		char[] ch = str.toCharArray();
		revstr(ch);
		System.out.println(new String(ch));
	}
	public static void revesestring(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
	public static void revstr(char[] ch) {
		int left = 0, right = ch.length - 1;
		while (left < right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
	}
}
