package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithNumber {
	public static void main(String[] args) {
		
		List<String> input=Arrays.asList("1apple","banana","3cherry","orange","7up");
		
		List<String> result=input.stream().filter(s-> !s.isEmpty() && Character.isDigit(s.charAt(0)))
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
