package in.aakash.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(-9));
		System.out.println(p.test(15));
		
		System.out.println("================");
		
		BiPredicate< Integer, Integer> bip = (i,j) -> (i+j) >= 15;
	      System.out.println(bip.test(2, 4));
	      System.out.println(bip.test(5, 5));
	      System.out.println(bip.test(2, 14));
	  
	}
}
