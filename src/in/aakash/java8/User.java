package in.aakash.java8;

import java.util.Optional;

public class User {

	// without Optional Object without null check
	public String getUsernameByuserId(int userId) {

		if (userId == 100) {
			return "Raju";
		} else if (userId == 101) {
			return "Rani";
		} else if (userId == 102) {
			return "Deepak";
		} else {
			return null;
		}
	}

	// with optional Object
	public Optional<String> getUsernameById(int userId) {

		String name = null;
		if (userId == 100) {
			name = "Raja";
		} else if (userId == 101) {
			name = "Rani";
		} else if (userId == 102) {
			name = "Deepak";
		}
		return Optional.ofNullable(name);

	}
}
