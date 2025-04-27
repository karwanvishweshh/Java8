package Programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
	public static void main(String[] args) {
		
		int[] arr= {10,20,50,40,30};
		
		int secondLargest=Arrays.stream(arr)
				.boxed()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(()-> new RuntimeException("No second largest Element"));
		
		System.out.println("Second Largest:"+ secondLargest);
	}

}
