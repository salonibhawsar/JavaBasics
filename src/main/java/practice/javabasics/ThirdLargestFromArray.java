package practice.javabasics;

import java.util.Arrays;

//14Aug2023
public class ThirdLargestFromArray {

	public static void main(String[] args) {
		int array[] = { 10, 20, 25, 63, 96, 57 };
		int size = array.length;
		System.out.println("Length of array is :"+size);
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int max = array[size - 3];
		System.out.println("3rd largest element is :" + max);
	}
}
