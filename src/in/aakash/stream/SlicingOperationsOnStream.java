package in.aakash.stream;

import java.util.Arrays;
import java.util.List;

public class SlicingOperationsOnStream {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("core java", "adv java", "springBoot", "Restservices", "microservices");

		courses.stream().limit(3).forEach(c -> System.out.println(c));
		System.out.println("====================");
		courses.stream().skip(2).forEach(c -> System.out.println(c));

		List<String> names = Arrays.asList("Raja", "Rani", "Raja", "Rani,", "Raja", "Rani", "aklesh", "sanjay");
		System.out.println("====================");
		names.stream().distinct().forEach(n -> System.out.println(n));
	}
}
