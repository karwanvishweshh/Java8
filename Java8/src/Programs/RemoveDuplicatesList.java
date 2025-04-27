package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,2,3,45,45);
		
		List<Integer> uniqueList=numbers.stream().distinct().collect(Collectors.toList());

		System.out.println(uniqueList);
	}

}
