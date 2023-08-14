package practice.javabasics;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0 ;
				
		for(int i : test)
		{
			sum = sum + i;
		}
		
		System.out.println("The sume is :"+sum);

	}

}
			