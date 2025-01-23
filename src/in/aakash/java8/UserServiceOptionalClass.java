package in.aakash.java8;

import java.util.Optional;
import java.util.Scanner;

public class UserServiceOptionalClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID");
		int userId = sc.nextInt();

		User u = new User();
		/*
		 * String userName = u.getUsernameByuserId(userId); String msg =
		 * userName.toUpperCase() + ", Hello"; System.out.println(msg);
		 */

		Optional<String> userName = u.getUsernameById(userId);
		if (userName.isPresent()) {
			String name = userName.get();
			String msg = name.toUpperCase() + ", Hello";
			System.out.println(msg);
		} else {
			System.out.println("No Data Found");
		}
	}
}
