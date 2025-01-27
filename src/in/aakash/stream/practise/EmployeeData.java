package in.aakash.stream.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Geeta", 25, "female", "Sales", 2023, 41500.00);
		Employee e2 = new Employee(2, "Swathi", 25, "female", "Developement", 2023, 41500.00);
		Employee e3 = new Employee(3, "Nikita", 25, "female", "Sales", 2023, 71500.00);
		Employee e4 = new Employee(4, "Gita", 26, "female", "Developement", 2023, 41500.00);
		Employee e5 = new Employee(5, "Charles", 25, "male", "Security", 2023, 31500.00);
		Employee e6 = new Employee(6, "Cathy", 25, "female", "Finance", 2021, 41500.00);
		Employee e7 = new Employee(7, "Ramesh", 25, "male", "Developement", 2023, 41500.00);
		Employee e8 = new Employee(8, "Suresh", 33, "male", "Developement", 2023, 51500.00);
		Employee e9 = new Employee(9, "Nithin", 25, "male", "Finance", 2018, 71500.00);
		Employee e10 = new Employee(10, "Raja", 25, "male", "Infrastructure", 2021, 61500.00);
		Employee e11 = new Employee(11, "shivam", 25, "male", "Sales", 2024, 41500.00);
		Employee e12 = new Employee(12, "Rani", 55, "female", "HR", 2021, 81500.00);
		Employee e13 = new Employee(13, "Rahul", 45, "male", "HR", 2013, 91500.00);
		Employee e14 = new Employee(14, "Anuradha", 24, "female", "Developement", 2019, 55500.00);
		Employee e15 = new Employee(15, "Aayush", 29, "male", "Developement", 2023, 61500.00);
		Employee e16 = new Employee(16, "Sachin", 35, "male", "Security", 2022, 31700.00);
		Employee e17 = new Employee(17, "Radha", 25, "female", "HR", 2020, 31500.00);
		Employee e18 = new Employee(18, "suraj", 22, "male", "Developement", 2021, 21500.00);

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17,
				e18);

		// 1 How many female & male emps are there in the orgnizs?
		/*
		 * Map<String, Long> map1 = emps.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		 * System.out.println(map1);
		 */

		/*
		 * 2 Print the name of all departements in the organixation emps.stream()
		 * .map(Employee::getDepartment) // //.map(e -> e.department) .distinct()
		 * .forEach(e->System.out.println(e));
		 */

		// 3 What is the average age of the male & female employees?
		/*
		 * Map<String, Double> map = emps.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(
		 * Employee::getAge))); System.out.println(map);
		 */

		// 4 get the details of highest paid employee in the organization
		/*
		 * Optional<Employee> optional = emps.stream()
		 * .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 * if (optional.isPresent()) { System.out.println(optional.get()); }
		 */

		/*
		 * //5 Get the names of all employees who have joined aftre 2022 ? emps.stream()
		 * .filter(e-> e.yearOfJoining>2022) .map(name -> name.name)
		 * .forEach(e->System.out.println(e));
		 */

		// 6 count the number of employees in each departement?
		/*
		 * Map<String, Long> map = emps.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())
		 * ); System.out.println(map);
		 */

		// 7 What is the average salary of each departement
		/*
		 * Map<String, Double> map = emps.stream()
		 * .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.
		 * averagingDouble(Employee::getSalary))); System.out.println(map);
		 */

		// 8 Get the details of youngest male employee in the Developement department?

		/*
		 * Optional<Employee> optional = emps.stream() .filter(e->
		 * e.getGender().equals("male") && e.getDepartment().equals("Developement"))
		 * .min(Comparator.comparing(Employee::getAge));
		 * 
		 * if (optional.isPresent()) { System.out.println(optional.get()); }
		 */

		// 9 who has the most working experience in the organization?
		/*
		 * Optional<Employee> optional = emps.stream()
		 * .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		 * if (optional.isPresent()) { System.out.println(optional.get()); }
		 */

		// 10 how many male & female employees are there in Sales departement?
		/*
		 * Map<String, Long> map = emps.stream() .filter(e->
		 * e.getDepartment().equals("Sales"))
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 * System.out.println(map);
		 */

		// 11 What is the average salary of the male & female employees?
		/*
		 * Map<String, Double> map = emps.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble
		 * (Employee::getSalary))); System.out.println(map);
		 */

		// 12 List down the names of all the employees in each department?

		Map<String, Map<String, List<Employee>>> map = emps.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getName)));
		//System.out.println(map);
		
		
		
		// 16 get the emp who is having  highest salary in organization
		/*
		 * Optional<Employee> collect = emps.stream()
		 * .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))); if
		 * (collect.isPresent()) { System.out.println(collect.get()); }
		 */
		
		// 17 get the emp who is having second highest salary
		// sort the emps based on salary in descending order then skip first record
		
		/*
		 * Optional<Employee> optional = emps.stream()
		 * .sorted(Comparator.comparing(Employee::getSalary) .reversed()) .skip(1).
		 * findFirst();
		 * 
		 * if (optional.isPresent()) { //System.out.println(optional.get()); } //OR
		 * 
		 * List<Employee> collect = emps.stream()
		 * .sorted(Comparator.comparing(Employee::getSalary)
		 * .reversed()).collect(Collectors.toList());
		 * 
		 * System.out.println(collect.get(1));
		 */
		  
		  
		  // 18 
		  
		  
		// 13 What is the average salary & total salary of the whole organization?

		// 14 Separate the employees who are younger or equals to 25 year from those
		// employees who re older than 25 years?

		// 15 who is the oldest employee in the organization? What is his age & which
		// department is belong to?

	}
}

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}