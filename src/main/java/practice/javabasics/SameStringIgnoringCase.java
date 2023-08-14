package practice.javabasics;

public class SameStringIgnoringCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myStr1 = "Test";
		String myStr2 = "TEST";
		String myStr3 = "Java basics Pratice";
		System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
		System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
	}

}
