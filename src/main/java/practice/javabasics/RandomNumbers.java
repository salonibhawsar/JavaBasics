package practice.javabasics;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//14Aug2023

public class RandomNumbers {

	public static void main(String args[]) {
		// USing MAth class
		System.out.println("Random Number: " + Math.random());

		// USing Random Class

		Random random = new Random();
		// Generates random integers 0 to 49
		int x = random.nextInt(50);

		System.out.println("Randomly Generated Integer Value using random class");
		System.out.println(x);

		// Using ThreadReandom Class

		// Generate random integers between 0 to 999
		int a = ThreadLocalRandom.current().nextInt();

		System.out.println("Randomly Generated Integer Value using ThreadRandom class");
		System.out.println(a);
	}
}
