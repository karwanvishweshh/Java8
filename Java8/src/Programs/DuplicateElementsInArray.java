package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,2,3,2,4,5,1,6};
		
		Set<Integer> seen=new HashSet<>();
		
		
		List<Integer> duplicates=Arrays.stream(arr)
				.filter(n -> !seen.add(n))
				.distinct()
				.collect(Collectors.toList());
		System.out.println(duplicates);
	}

}
