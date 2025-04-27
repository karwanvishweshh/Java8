package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEven {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(2,4,3,5,9,55,66,544,332);
		
		
		List<Integer> result=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(result);
	}

}
