package Programs;

import java.util.stream.IntStream;

public class SumOf10Natural {
	public static void main(String[] args) {
		
		int sum=IntStream.rangeClosed(1,10)
				.sum();
		System.out.println(sum);
	}

}
