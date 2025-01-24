package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoFirst {

	public static void main(String[] args) {

		// print the names which are starting with 'A' using stream api.
		List<String> names = Arrays.asList("Anushka", "Aakash", "Ashok", "Jhon", "Smith", "Orlen");
		// names.stream().filter(i -> i.startsWith("A")).forEach(i ->
		// System.out.println(i));

		User u1 = new User("Aakash", 35);
		User u2 = new User("Shyam", 21);
		User u3 = new User("Smth", 30);
		User u4 = new User("Jhon", 11);
		User u5 = new User("Raja", 17);
		User u6 = new User("Rani", 19);

		Stream<User> stream = Stream.of(u1, u2, u3, u4, u5, u6);

		// age >= 18
		// stream.filter(i -> i.age >= 18).forEach(i -> System.out.println(i));

		// age >= 18 And name startwith A
		/*
		 * stream.filter(i -> i.age >= 18 && i.name.startsWith("A")) .forEach(i ->
		 * System.out.println(i));
		 */

		stream.filter(u -> u.age >= 18).filter(u -> u.name.startsWith("A")).forEach(u -> System.out.println(u));

	}
}

class User {
	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
