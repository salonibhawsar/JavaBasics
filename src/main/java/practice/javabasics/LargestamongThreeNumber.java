package practice.javabasics;

public class LargestamongThreeNumber {
	
	public static void main(String[] args) {
		
		int numberOne = 5093;
		int numberTwo = 380 ;
		int numberThree = 426887 ;
		
		
		if(numberOne>=numberTwo && numberOne>=numberThree)
		System.out.println(numberOne+" numberOne is the largest Number");
		else if (numberTwo>=numberOne && numberTwo>=numberThree)
		System.out.println(numberTwo+" numberTwo is the largest Number");
		else
		System.out.println(numberThree+" numberThree is the largest Number");
			
			
	}

}
