package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeUnsortedIntoSingleArray {

	public static void main(String[] args) {
		
		Integer[] arr1= {10,2,5};
		
		Integer[] arr2= {8,1,7};
		
		List<Integer> mergeSortedList=Stream.concat(Arrays.stream(arr1),Arrays.stream(arr2))
				.sorted()
				.collect(Collectors.toList());
		System.out.println(mergeSortedList);
		
	}
}
