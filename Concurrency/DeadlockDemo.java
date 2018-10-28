package com.concurrency;

public class DeadlockDemo {
	public static void main(String[] args) {

		String resource1 = "A";
		String resource2 = "B";

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1 acquired lock on resource1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource2) {
						System.out.println("Thread 1 acquired lock on resource2");
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2 acquired lock on resource2");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (resource1) {
						System.out.println("Thread2 acquired lock on resource1");
					}
				}

			}

		}).start();
	}
}
