package in.aakash.java8;

interface MyInterface {
	public void m1();
}

public class MethodRef {

	public static void m2() {
		System.out.println("m2 () method called..!!!");
	}

	public static void main(String[] args) {

		// MyInterface mi1 = ()-> System.out.println("Hi");
		MyInterface mi = MethodRef::m2;
		mi.m1();

	}
}
