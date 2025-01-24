package in.aakash.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamRequirements {

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(1, "Robert", 26500.00,"CHINA");
		Employee2 e2 = new Employee2(2, "Abraham", 31500.00,"JAPAN");
		Employee2 e3 = new Employee2(3, "Aakash", 92500.00,"INDIA");
		Employee2 e4 = new Employee2(5, "Sachin", 55500.00,"CANADA");
		Employee2 e5 = new Employee2(4, "Raju", 71500.00,"INDIA");
		Employee2 e6 = new Employee2(4, "Ching", 71500.00,"CHINA");
		

		List<Employee2> list = Arrays.asList(e1, e2, e3, e4, e5,e6);
		
		Map<String, List<Employee2>> data = list.stream()
		                                    .collect(Collectors.groupingBy(e->e.country));
		
		    System.out.println(data);
		    
		    
		
		
		
		
		
		
		
		
		

		// once we do some operation on stream again we can not do another operation on
		// stream
		// if you use same stream to perform two operation it will not accept
		// we can do only one operation on stream at a time

		/*
		 * Optional<Employee2> max =
		 * list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		 * System.out.println(max.get());
		 * 
		 * Optional<Employee2> min =
		 * list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		 * System.out.println(min.get().salary);
		 * 
		 * Double avgsalary = list.stream().collect(Collectors.averagingDouble(e ->
		 * e.salary));
		 * 
		 * System.out.println(avgsalary);
		 */

	}

}

class Employee2 {
	int id;
	String name;
	double salary;
	String country;

	public Employee2(int id, String name, double salary, String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ",country=" + country + "]";
	}

}
