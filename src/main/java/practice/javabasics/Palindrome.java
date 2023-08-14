package practice.javabasics;

import java.util.Scanner;

//14Aug2023
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int number, reverse = 0, temp;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check whether it is palindrome or not ");
			number = sc.nextInt();
			temp = number;
			while (number != 0) {
				int remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}

			if (temp == reverse)
				System.out.println("Given number " + temp + " is palindrome");
			else
				System.out.println("Given number " + temp + " is not palindrome");
		}
	}
}
