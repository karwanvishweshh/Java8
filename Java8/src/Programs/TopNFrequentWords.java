package Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopNFrequentWords {
	public static void main(String[] args) {
		
		String paragraph="Java is great and java is powerful. Streams in java are powerful tools.";
		
		int topN=3;
		Map<String,Long>wordFrequency=Arrays.stream(paragraph.toLowerCase().split("\\W+"))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		List<Map.Entry<String,Long>> topWords=wordFrequency.entrySet()
				.stream()
				.sorted(Map.Entry.<String,Long>comparingByValue(Comparator.reverseOrder()))
				.limit(topN)
				.collect(Collectors.toList());
		
		topWords.forEach(e->System.out.println(e.getKey()+" ->" +e.getValue()));
	}

}
