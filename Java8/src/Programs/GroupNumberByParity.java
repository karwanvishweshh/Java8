package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumberByParity {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		Map<String,List<Integer>> groupedByparity=numbers.stream().collect(Collectors.groupingBy(n->n%2==0?"even":"odd"));
//
//		
//		System.out.println(groupedByparity.get("even"));
//		System.out.println(groupedByparity
//				.get("odd"));
		
		Map<Boolean, List<Integer>> partitioned = numbers.stream()
	            .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // true = even, false = odd

	        List<Integer> evenNumbers = partitioned.get(true);
	        List<Integer> oddNumbers = partitioned.get(false);

	        System.out.println("Even Numbers: " + evenNumbers);
	        System.out.println("Odd Numbers: " + oddNumbers);
	}
	
	

}
