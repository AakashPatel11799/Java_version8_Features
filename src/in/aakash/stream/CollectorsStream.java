package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsStream {

	public static void main(String[] args) {
		
		Person p1 = new Person("Steve", "USA");
		Person p2 = new Person("Aakash", "INDIA");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Jhon", "JAPAN");
		Person p6 = new Person("Kumar", "INDIA");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		// collect names of persons who are belongs to INDIA and store into names collection
		
		      List<String> names = persons.stream()
		             .filter(p-> p.county.equals("INDIA"))
		             .map(p-> p.name)
		             .collect(Collectors.toList());

		      System.out.println(names);
		     
	}

}

