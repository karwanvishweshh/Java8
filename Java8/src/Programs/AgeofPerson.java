package Programs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class AgeofPerson {
	public static void main(String[] args) {
		
		
		List<LocalDate> dobList=Arrays.asList(
				LocalDate.of(2004, 9, 20),
				LocalDate.of(2001, 6, 13),
				LocalDate.of(1997, 3, 15)
				);
		
		dobList.stream().map(dob-> Period.between(dob, LocalDate.now()).getYears())
		.forEach(age->System.out.println("Age: "+age+" years"));
	}

}
