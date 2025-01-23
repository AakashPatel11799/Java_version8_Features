
package in.aakash.java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {

	public static void main(String[] args) {

		// Date d1 = new Date();
		// System.out.println(d1); // Fri Jan 24 03:16:48 IST 2025

		LocalDate date = LocalDate.now();
		System.out.println(date); // 2025-01-24

		date = date.plusDays(3);
		System.out.println(date); // 2025-01-27

		date = date.plusMonths(2);
		System.out.println(date); // 2025-03-27

		date = date.plusYears(2);
		System.out.println(date); // 2027-03-27

		boolean leapYear = LocalDate.parse("2024-02-11").isLeapYear();
		System.out.println("Leap Year : " + leapYear);

		boolean before = LocalDate.parse("2024-12-23").isBefore(LocalDate.parse("2025-01-23"));
		System.out.println("Before Date :" + before);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		time = time.plusMinutes(10);
		System.out.println(time);

		time = time.plusHours(2);
		System.out.println(time);

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);

		Period period = Period.between(LocalDate.parse("1999-07-11"), LocalDate.now());
		System.out.println(period);

		Duration duration = Duration.between(LocalTime.parse("03:40"), LocalTime.now());
		System.out.println(duration);

	}
}
