package com.recursion;

/**
 * Euclid's algorithm to find greatest common divisor
 * 
 * @author Ashish
 *
 */
public class GCD {

	public static void main(String[] args) {
		System.out.println("Greatest common divisor of 10 and 5 = " + gcd(10, 5));
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
