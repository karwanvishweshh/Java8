package Programs;

import java.util.Arrays;

public class SumAverage {
	
	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50};
		
		int sum=Arrays.stream(numbers).sum();
		
		double average=Arrays.stream(numbers).average().orElse(0);
		
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+average);
	}

}
