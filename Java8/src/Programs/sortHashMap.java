package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortHashMap {
	public static void main(String[] args) {
		
		Map<String,Integer>map= new HashMap<>();
		
		map.put("banana", 3);
		map.put("apple", 5);
		map.put("cherry", 2);
		
		
		//sort BY key
		Map<String,Integer>sortedByKey=map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1,e2)-> e1,
						LinkedHashMap::new));
		System.out.println(sortedByKey);
	
	//sort by value
	
	Map<String,Integer> sortedByValue=map.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
					(e1,e2) -> e1,
					LinkedHashMap::new));
	System.out.println(sortedByValue);
	}	

}
