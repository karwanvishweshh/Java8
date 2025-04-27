package Programs;

import java.util.Arrays;
import java.util.List;

public class CheckPositive {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,5,9,8,0);
		
		boolean isPositive=numbers.stream().allMatch(n->n>0);
		
		System.out.println(isPositive);
	}

}
