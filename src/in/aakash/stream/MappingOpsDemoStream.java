package in.aakash.stream;

import java.util.Arrays;
import java.util.List;

public class MappingOpsDemoStream {

	public static void main(String[] args) {

		List<String> countries = Arrays.asList("india", "usa", "uk", "japan", "russia");

		/*
		 * for (String country : countries) { System.out.println(country.toUpperCase());
		 * }
		 */

		//countries.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));

		//countries.stream().mapToInt(name -> name.length()).forEach(n -> System.out.println(n));
		
		
		List<String> names = Arrays.asList("Anil","Aakash","Ashok","Raju","Deepak","Rani");
		
		// print name with its length which are starting with 'A' using stream API
		// aakash - 6
		// Anil - 4
		
		names.stream()
		     .filter(name -> name.startsWith("A"))
		     .map(name -> name + "-" + name.length())
		     .forEach(name-> System.out.println(name));
		
		
		
		
		
		
		
		
	}
}
