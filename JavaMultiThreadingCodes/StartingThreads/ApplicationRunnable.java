package A.StartingThreads;

/**
 * Starting Threads using Runnable Interface
 * <br><br>
 * Codes with minor comments are from
 * <a href="http://www.caveofprogramming.com/youtube/">
 * <em>http://www.caveofprogramming.com/youtube/</em>
 * </a>
 * <br>
 * also freely available at
 * <a href="https://www.udemy.com/java-multithreading/?couponCode=FREE">
 *     <em>https://www.udemy.com/java-multithreading/?couponCode=FREE</em>
 * </a>
 *
 * @author Z.B. Celik <celik.berkay@gmail.com>
 */
class RunnerRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello: " + i + " Thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ApplicationRunnable {
	
	static Runnable r1 = new Runnable() {
		@Override
		public void run() {
			System.out.println("Hello world one!");
		}
	};

    public static void main(String[] args) {
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(new RunnerRunnable());
        thread1.run();
        thread2.start();
    }

}
