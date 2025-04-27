package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMinMax {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(12,222,33,9999,67,12,1,2,777);
		
		List<Integer> top3Max=numbers.stream().sorted(Comparator.reverseOrder())
				.limit(3)
				.collect(Collectors.toList());
		
		System.out.println("Top 3 Max:"+top3Max);
		
		List<Integer> top3Min=numbers.stream().sorted().limit(3).collect(Collectors.toList());
		
		System.out.println("Top 3 Min:"+top3Min);
	}

}
