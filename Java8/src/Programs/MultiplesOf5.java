package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOf5 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(5,89,90,50,44,70,30,22,20,10);
		
		List<Integer> result=numbers.stream().filter(n ->n%5==0).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
