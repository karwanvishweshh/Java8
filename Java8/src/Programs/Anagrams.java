package Programs;

import java.util.stream.Collectors;

public class Anagrams {
	
	public static boolean isAnagram(String s1,String s2) {
		if(s1==null || s2==null ||s1.length() !=s2.length())
			
			return false;
		
	   String sorted1=s1.chars().sorted().mapToObj(c-> String.valueOf((char) c))
			   .collect(Collectors.joining());
	   
	   String sorted2=s2.chars().sorted().mapToObj(c-> String.valueOf((char) c))
			   .collect(Collectors.joining());
		
	  return sorted1.equals(sorted2);
	}
	
	public static void main(String[] args) {
		
		Boolean result= isAnagram("madam","madam");
		System.out.println(result);
	}

}
