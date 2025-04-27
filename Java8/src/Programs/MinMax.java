package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(15,22,9,88,35);
		
		int max=numbers.stream().max(Comparator.naturalOrder())
				.orElseThrow(()-> new RuntimeException("List is Empty"));
		
		int min=numbers.stream().min(Comparator.naturalOrder())
				.orElseThrow(()-> new RuntimeException("List is Empty"));
		
		System.out.println(max +":"+min);
	}

}
