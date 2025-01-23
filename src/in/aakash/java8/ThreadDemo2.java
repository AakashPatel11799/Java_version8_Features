package in.aakash.java8;

// Approach-2
public class ThreadDemo2 {

	public static void main(String[] args) {

		// Annonymous implementation
		Runnable r = new Runnable() {
			@Override
			public void run() {

				for (int i = 1; i <= 6; i++)
					System.out.println(i);
			}
		};

		Thread t = new Thread(r);
		t.start();
	}
}
