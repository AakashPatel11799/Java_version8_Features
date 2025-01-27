package in.aakash.stream.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
// write a java program to read a file data and print it on the console?.

public class ReadFileData {

	public static void main(String[] args) throws Exception {

		/*
		 * FileReader fr = new FileReader(new
		 * File("src/in/aakash/stream/practise/info.txt")); BufferedReader br = new
		 * BufferedReader(fr); String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); }
		 * br.close();
		 */

		String fileName = "src/in/aakash/stream/practise/info.txt";

		List<String> lines = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			// stream.forEach(line -> System.out.println(line));

			stream.filter(line -> line.startsWith("H")).forEach(line -> System.out.println(line));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
