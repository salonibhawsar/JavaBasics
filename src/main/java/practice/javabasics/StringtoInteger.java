package practice.javabasics;

public class StringtoInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// USing parsseInt

		String s = "1000";

		int i = Integer.parseInt(s);

		System.out.println("The integer value of given string is :" + s);

		// USing Integer.valueOf()

		String s1 = "2000";

		int j = Integer.valueOf(s1);

		System.out.println("The integer value of given string is :" + s1);

	}

}
