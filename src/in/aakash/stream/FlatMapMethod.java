package in.aakash.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

	public class FlatMapMethod {
	
		public static void main(String[] args) {
	
			List<String> javaCourses = Arrays.asList("core java", "adv java", "springboot");
			List<String> uicourses = Arrays.asList("html", "css", "js"); 
			List<String> dbcourses = Arrays.asList("oracle", "mysql", "mongodb");
	
			List<List<String>> courses = Arrays.asList(javaCourses, uicourses,dbcourses);
	
			// courses.stream().forEach(c-> System.out.println(c));
	
			Stream<String> stream = courses.stream().flatMap(s -> s.stream());
			stream.forEach(c -> System.out.println(c));
		}
	}
