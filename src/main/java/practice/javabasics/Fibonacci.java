package practice.javabasics;
//14Aug2023

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int n1 = 0, n2 = 1, n3, i, count = 10; // we can also take value of count using the scanner class , currently i am printing the series till 1

			for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
			{
				n3 = n1 + n2; //1 , 2 , 3 , 5 , 8 .............
				System.out.print(" " + n3); // 1 , 2  , 3 , 5
				n1 = n2; // 1 ,1 , 2 , 3 ..........
				n2 = n3; //1 , 2 , 3 , 5 ..........
			}

		}
	}

}
