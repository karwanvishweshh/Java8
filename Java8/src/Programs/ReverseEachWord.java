package Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
		String sentence="Java Stream Example";
		
		String reverseWords=Arrays.stream(sentence.split(" "))
				.map(word-> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		
		System.out.println("Reversed each word: "+ reverseWords);
	}

}
