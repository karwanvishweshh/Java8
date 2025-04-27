package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstCharacterGroupWord {
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("apple","apricot","banana","blueberry","cherry","carrot");
		
		
		Map<Character,List<String>> grouped=
				words.stream()
				.collect(Collectors.groupingBy(word->word.charAt(0)));
		
		grouped.forEach((k,v)->System.out.println(k + " -> "+v));
		
		
	}

}
