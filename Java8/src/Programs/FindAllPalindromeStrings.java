package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPalindromeStrings {
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("madam","racecar","apple","noon","java","level");
		
		
		List<String> palindromes=words.stream()
				.filter(word->word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
				.collect(Collectors.toList());
		System.out.println(palindromes);
	}
		

}
