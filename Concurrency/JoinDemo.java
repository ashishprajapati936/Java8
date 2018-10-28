package com.concurrency;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				// TODO Auto-generated method stub

			}
		});
		t1.start();
		t1.join();
		System.out.println("Multi threading Completed");
	}
}
