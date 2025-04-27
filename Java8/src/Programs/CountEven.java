package Programs;

import java.util.Arrays;
import java.util.List;

public class CountEven {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(2,4,6,8,10,12,3,5);
		
		long count = numbers.stream().filter(n-> n%2==0).count();
		System.out.println(count);
		}

}
