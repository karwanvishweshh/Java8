package Programs;

public class SumOfAllDigits {
	public static void main(String[] args) {
		
		int number=12345;
		
		int sum=String.valueOf(number)
				.chars()
				.map(c-> c-'0')
				.sum();
		System.out.println(sum);
	}

}
