package in.aakash.java8;

import java.util.function.Predicate;

public class PredicateTwo {
	public static void main(String[] args) {

		String[] names = 
			{ "Anushka", "Sunny", "Anupama", "Shubham", "Deepak", "Raj", "Ashok", "Kajol" };
		// Predicate<String> p = name -> name.startsWith("A");
		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if (!p.test(name))
				System.out.println(name);
		}
	}
}
