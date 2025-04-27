package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnSortedArrayIntoSingleWithoutDuplicates {

	public static void main(String[] args) {
		
		Integer[] arr1= {10,2,5,5};
		Integer[] arr2= {8,1,7,2};
		
		List<Integer> result=Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().collect(Collectors.toList());
		System.out.println(result);
	}
}
