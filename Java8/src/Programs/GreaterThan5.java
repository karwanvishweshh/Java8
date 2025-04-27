package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GreaterThan5 {

	public static void main(String[] args) {
		
		
		List<Integer> numbers=Arrays.asList(5,7,4,3,2,1);
		
		Optional<Integer> result=numbers.stream().filter(n->n>5).findAny();
				System.out.println(result.get());

	}

}
