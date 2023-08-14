package practice.javabasics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Saloni";
		String reverseString = "";

		// char[] c = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			reverseString = ch + reverseString;
		}
		System.out.println("Reverse String is :" + reverseString);

		// second way

		String s1 = "Practice Program";
		char[] try1 = s1.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--) {
			System.out.print(try1[i]);
		}
	}
}
