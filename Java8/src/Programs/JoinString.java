package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Java","Spring","Angular");
		
		String result=names.stream().collect(Collectors.joining(",","[","]"));
		
		System.out.println(result);

	}

}
