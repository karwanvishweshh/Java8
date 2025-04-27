package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListReverse {

	public static void main(String[] args) {
	
		List<Integer> numbers=Arrays.asList(1,2,3,5,9,8,99,109,67);
		
		List<Integer> sortedList=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.print(sortedList);
	}

}
