package practice.javabasics;

public class LargestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arrOfNumbers[] = {2000, 87, 1780, 2, 98};
		int largest = arrOfNumbers[0];
		int i ;

		for (i = 1; i < arrOfNumbers.length; i++) {

			if (arrOfNumbers[i] > largest) {
				largest = arrOfNumbers[i];
			}
			
			System.out.println("Array Elemets are " + arrOfNumbers[i]);

		}
				
		System.out.println(largest + " it is the largest number from the given array");

	}

}
