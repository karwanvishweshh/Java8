package Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		
		String input="aabbccdbe";
		
		Character result=input.chars()//[a,a,b,b,c,c,d,b,e]
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
		
		System.out.println(result);
	}

}
