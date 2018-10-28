package com.concurrency;

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {

		String[] arr = new String[] { "A", "B", "C", "D" };

		for (int i = 0; i < arr.length; i++) {
			/*
			 * Sleep for 4 seconds
			 */
			Thread.sleep(4000);
			System.out.println(arr[i]);
		}
	}
}
