package Programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
	
	public static void main(String[] args) {
		
		String name="Vishweshwar";
		
		Map<Character,Long> frequencyMap=name.chars().
				mapToObj(c-> (char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(frequencyMap);
	}

}
