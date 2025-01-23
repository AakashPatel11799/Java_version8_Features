package in.aakash.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> f= (name) -> name.length();
		
		System.out.println(f.apply("aakash"));
		System.out.println(f.apply("patel"));
		System.out.println(f.apply("indore"));

		BiFunction<Integer,Integer,Integer> bif1 = (a,b) -> a+b; 
		
		System.out.println(bif1.apply(10, 20));

	}
}
