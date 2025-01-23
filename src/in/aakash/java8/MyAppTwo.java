package in.aakash.java8;

@FunctionalInterface
interface InterfaceTwo {
	public void m2();
}

public class MyAppTwo {

	public static void main(String[] args) {

		InterfaceTwo mit =
				() -> System.out.println("m2 () method called.........");
		mit.m2();
	}

}
