package com.concurrency;

public class InterruptDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadCreator threadCreator = new ThreadCreator();
		Thread test = new Thread(threadCreator);
		test.start();
		Thread.sleep(3000);
		test.interrupt();
		test.join(1000);
	}
}

class ThreadCreator implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("We have been interrupted");
				break;
			}
		}
	}

}