package in.aakash.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchingOperationsOnStream {

	public static void main(String[] args) {

		Person p1 = new Person("Steve", "USA");
		Person p2 = new Person("Aakash", "INDIA");
		Person p3 = new Person("Ashok", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		Person p5 = new Person("Jhon", "JAPAN");
		Person p6 = new Person("Kumar", "INDIA");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5,p6);
		
		
		// from one collection I am able to filter the data & I am getting another collection
		
		List<Person> indians = persons.stream()
		                               .filter(p->p.county.equals("INDIA"))
		                               .collect(Collectors.toList());
		
		System.out.println(indians.size()); // 3
		
		indians.forEach(p -> System.out.println(p));
		
		
		
		
		
		
		Optional<Person> firstPersion = 
				    persons.stream().filter(p->p.county.equals("INDIA")).findFirst();
		
		 if (firstPersion.isPresent()) {
				//System.out.println(firstPersion.get());
			}
		 
		 
		 // get all the person belongs to india I want to sub-collection not print the data 
		 // give me sub-collection object
		 Stream<String> stream1 = persons.stream().filter(p->p.county.equals("INDIA"))
		                                  .map(p-> p.name +"-"+ p.county); 
		 
		                // stream1.forEach(p-> System.out.println(p));
		 
		 
		/*
		 * Optional<Person> anyPersion =
		 * persons.stream().filter(p->p.county.equals("INDIA")).findAny();
		 * 
		 * if (anyPersion.isPresent()) { System.out.println(anyPersion.get());
		 * 
		 * }
		 */
		
		  

		/*
		 * boolean status1 = persons.stream().anyMatch(p -> p.county.equals("INDIA"));
		 * System.out.println("Any Indian Available ? :: " + status1);
		 * 
		 * boolean status2 = persons.stream().anyMatch(p -> p.county.equals("CANADA"));
		 * System.out.println("Any Canadian Available > :: " + status2);
		 * 
		 * boolean status3 = persons.stream().allMatch(p -> p.county.endsWith("INDIA"));
		 * System.out.println("All Person Available From India ? :: " + status3);
		 * 
		 * boolean status4 = persons.stream().noneMatch(p -> p.county.equals("MEXICO"));
		 * System.out.println("No Person Available from Mexico ? :: " + status4);
		 */
	}
}

class Person {
	String name;
	String county;

	Person(String name, String contry) {
		this.name = name;
		this.county = contry;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", county=" + county + "]";
	}

}