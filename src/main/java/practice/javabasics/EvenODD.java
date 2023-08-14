package practice.javabasics;

import java.util.Scanner;

public class EvenODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The Scanner class is used to get user input, and it is found in the java.util package.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter any number to know it is even or odd");
		
		int number = sc.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is ODD");
		}
		
	}

}
