package in.aakash.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo1 {

	// Stream creation
	public static void main(String[] args) {
		
		// Approach - 1
		Stream<Integer> stream1= Stream.of(1,2,3,4,5,6);
		
		ArrayList<String> names= new ArrayList<>();
		names.add("akash");
		names.add("Deepak");
		names.add("Shyam");
		names.add("Raja");
		
		// Approach - 2
		Stream<String> stream2 = names.stream();
	}
}
