package in.aakash.java8;

interface InterfceOne {
	public void m1();
}

public class MyAppone implements InterfceOne {

	@Override
	public void m1() {
		System.out.println("m1 () method called...");
	}

	public static void main(String[] args) {
		MyAppone app= new MyAppone();
		app.m1();
	}
}
