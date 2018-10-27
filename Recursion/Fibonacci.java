package com.recursion;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("1st element in fibonacci=" + fibonacci(0));
		System.out.println("2nd element in fibonacci=" + fibonacci(1));
		System.out.println("3rd element in fibonacci=" + fibonacci(2));
		System.out.println("4th element in fibonacci=" + fibonacci(3));
		System.out.println("5th element in fibonacci=" + fibonacci(4));
		System.out.println("6th element in fibonacci=" + fibonacci(5));
		System.out.println("7th element in fibonacci=" + fibonacci(6));
		System.out.println("8th element in fibonacci=" + fibonacci(7));
	}

	private static int fibonacci(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		return fibonacci(N - 1) + fibonacci(N - 2);
	}

}
