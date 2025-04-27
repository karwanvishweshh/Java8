package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncreasingOrderLength {
	
	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("Vishweshwar","raju","mahesh","eshwar");
		
		List<String> sortedByLength=names.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		
		System.out.println(sortedByLength);
	}

}
