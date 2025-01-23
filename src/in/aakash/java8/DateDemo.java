package in.aakash.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d); // Fri Jan 24 02:25:51 IST 2025

		// converting Date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String format = sdf.format(d);
		System.out.println(format); // 24/01/2025

		// Convert string to date
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf2.parse("30/08/1999");
		System.out.println(date);

		/*
		 *   dd/MM/yyyy : 24/01/2025
		 *   dd/MMM/yyyy : 24/Jan/2025
		 *   dd/MMMM/yyyy : 24/January/2025 
		 *   SimpleDateFormat("dd/MM/yy") : 24/01/25
		 */
	}
}
