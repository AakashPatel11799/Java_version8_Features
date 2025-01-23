package in.aakash.java8;

public class InstanceMethodRef {

	public void m1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		InstanceMethodRef imr = new InstanceMethodRef();
		Runnable r = imr::m1;
		Thread t = new Thread(r);
		t.start();
	}
}
