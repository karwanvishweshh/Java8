package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
	public static void main(String[] args) {
		
		Integer[] numbers= {10,20,30,40,50};
		
		List<Integer> revered=Arrays.stream(numbers)
				.collect(Collectors.collectingAndThen(
						Collectors.toList(),
						list->{
							Collections.reverse(list);
					return list;
				}));
		
		System.out.println(revered);
	}
	

}
