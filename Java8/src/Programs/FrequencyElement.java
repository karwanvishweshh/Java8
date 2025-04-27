package Programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyElement {
	public static void main(String[] args) {
		
		Integer[] arr= {10,20,10,30,20,10,40};
		Map<Integer,Long> frequencyMap=Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		frequencyMap.forEach((num,freq)->System.out.println(num+ "=>"+freq+" times"));
	}
}
