package in.aakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class PredicateThree {

	public static void main(String[] args) {

		Person p1 = new Person("Ajay", 19);
		Person p2 = new Person("Shubahn", 15);
		Person p3 = new Person("Ram", 22);
		Person p4 = new Person("shivam", 11);
		Person p5 = new Person("Abhi", 27);
		Person p6 = new Person("Deepak", 31);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4,p5,p6);
		Predicate<Person> p = name -> name.age >= 18;
		for (Person person : persons) {
			if (p.test(person))
				System.out.println(person.name);
		}
	}
}
