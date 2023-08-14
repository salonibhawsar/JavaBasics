package practice.javabasics;

import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2023;
		if (Year.of(year).isLeap())

			System.out.println("Give year " + year + " is leap year");

		else
			System.out.println("Give year " + year + " is not a leap year");

	}

}
