package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
	public static void main(String[] args) {
		
		Integer[] arr1= {1,2,3,4,5};
		
		Integer[] arr2= {3,4,5,6,7};
		
		
		List<Integer>common=Arrays.stream(arr1)
				.filter(Arrays.asList(arr2)::contains)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(common);
		
	}

}
