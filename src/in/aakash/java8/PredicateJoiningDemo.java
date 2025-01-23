package in.aakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String location;
	String dept;

	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}

}

public class PredicateJoiningDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Raju", "Mumbai", "DevOps");
		Employee e2 = new Employee("Aaja", "Hyderabad", "Database");
		Employee e3 = new Employee("Ramesh", "Mumbai", "Developement");
		Employee e4 = new Employee("Deepak", "Delhi", "Database");
		Employee e5 = new Employee("Rani", "Hyderabad", "Testing");
		Employee e6 = new Employee("Aakash", "Ahmadabad", "Developement");

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);

		Predicate<Employee> p1 = e -> e.location.equals("Hyderabad");
		Predicate<Employee> p2 = e -> e.dept.equals("Database");
		Predicate<Employee> p3 = e -> e.name.startsWith("A");
		
		// Predicate Joining
		Predicate<Employee> p = p1.and(p2).and(p3);
		//Predicate<Employee> p = p1.or(p2);
		
		for (Employee employee : employees) {
			if(p.test(employee))
				System.out.println(employee.name);
		}

	}
}
