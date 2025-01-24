package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirestDemoStream {

	public static void main(String[] args) {

		// Stream<Integer> stream1 = Stream.of(56, 71, 11, 31, 90, 44, 69);

		List<Integer> list = Arrays.asList(11, 8, 31, 90, 44, 69);

		/*
		 * for (Integer i : list) { if (i > 20) { System.out.println(i); } }
		 */

		/*
		 * Stream<Integer> stream = list.stream(); Stream<Integer> filterstrStream =
		 * stream.filter(i -> i > 20); filterstrStream.forEach(i -> System.out.print(i +
		 * " "));
		 */

		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

	}

}
