package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTwoStreams {
	public static void main(String[] args) {
		
//		List<Integer> list1=Arrays.asList(1,2,3);
//		List<Integer> list2=Arrays.asList(4,5,6);
//		List<Integer> mergedList=Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
//		
//		System.out.println(mergedList);

	
	//without streams
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = Arrays.asList(4, 5, 6);

	list1.addAll(list2);	
	
	System.out.println("Merged without Streams:"+list1);

}
}
