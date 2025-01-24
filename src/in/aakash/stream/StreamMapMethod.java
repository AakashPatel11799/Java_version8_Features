package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapMethod {

	public static void main(String[] args) {

		// Task: Print Emp Name with emp age whose salary is greater than equal 50,000
		// using stream api.

		Employee emp1 = new Employee("akash", 25, 50000);
		Employee emp2 = new Employee("akashay", 35, 70000);
		Employee emp3 = new Employee("ashok", 22, 24000);
		Employee emp4 = new Employee("shubham", 30, 50000);
		Employee emp5 = new Employee("Rani", 23, 35000);

		Stream<Employee> stream = Stream.of(emp1, emp2, emp3, emp4, emp5);
		/*
		 * stream.filter(e -> e.salary >= 50000) .map(e-> e.name +"-"+e.age)
		 * .forEach(e-> System.out.println(e));
		 */

		stream.filter(e -> e.salary >= 50000).forEach(e -> System.out.println(e.name + "-" + e.age));

		// List<Employee> emplist = Arrays.asList(emp1,emp2,emp3,emp4,emp5);

		/*
		 * emplist.stream() .filter(emp-> emp.salary >= 50000) .map(name -> name.name
		 * +"-" + name.age) .forEach(name -> System.out.println(name));
		 */

	}
}

class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}