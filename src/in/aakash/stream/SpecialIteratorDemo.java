package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpecialIteratorDemo {

	public static void main(String[] args) {

		List<String> players = Arrays.asList("Sachin", "Sehwag", "Dhoni", "Virat", "Bumrah");
		Spliterator<String> spliterator = players.stream().spliterator();
		spliterator.forEachRemaining(n -> System.out.println(n));

	}
}
