package com.concurrency;

public class SynchronizedMethodsDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread t1 retrieved valued of counter" + c.value());
				c.increment();
				System.out.println("Increment counter");

			}
		});

		t1.start();

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread t2 retrieved value of counter" + c.value());
				c.decrement();
				System.out.println("Decrement Counter");
			}
		});
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Main Thread retrieved value of counter " + c.value());

	}
}

class Counter {
	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public int value() {
		return c;
	}
}
