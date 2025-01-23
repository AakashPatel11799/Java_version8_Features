package in.aakash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> c = name -> System.out.println(name + ", Good Evening..!");
		c.accept("Aakash");
	    c.accept("Ram");
	    c.accept("Sita");
	
	    List<Integer> numbers = Arrays.asList(10,20,30,40,50);
	    numbers.forEach(num -> System.out.println(num));
	    
	}

}