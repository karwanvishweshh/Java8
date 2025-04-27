package Programs;

import java.util.Arrays;

public class LastElement {
	public static void main(String[] args) {
		
		Integer[] arr= {10,20,30,40,50,100};
		
		int last=Arrays.stream(arr).reduce((first,second)-> second).orElseThrow(()-> new RuntimeException("Array is Empty"));
		System.out.println(last);
	}

}
