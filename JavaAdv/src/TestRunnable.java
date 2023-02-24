
public class TestRunnable implements Runnable {

	public void run() {
		String countStar = "";
		char a = 33;
		for (int i = 0; i < 10; i++) {
			countStar += "*";
		System.out.print(a + countStar + a + "\n");
		a++;
	}
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
}
