package com.stack;

import java.util.Arrays;
import java.util.Scanner;

/**
 * There are N frustrated coders standing in a circle with a gun in their hands.
 * Each coder has a skill value S[ i ] and he can only kill those coders that
 * have strictly less skill than him. One more thing, all the guns have only 1
 * bullet. This roulette can take place in any random order. Fortunately, you
 * have the time stone (haaan wo harre wala) and you can see all possible
 * outcomes of this scenario. Find the outcome where the total sum of the
 * remaining coder's skill is minimum. Print this sum.
 * 
 * INPUT
 * 
 * The first line contains N the no. of coders
 * 
 * The next line contains N elements where the ith element is theS[ i ] of ith
 * coder.
 * 
 * OUTPUT
 * 
 * Print a single line containing the minimum sum
 * 
 * SAMPLE INPUT
 * 
 * 6
 * 
 * 1 7 2 2 4 4
 * 
 * SAMPLE OUTPUT
 * 
 * 11
 * 
 * 
 * @author Ashish
 *
 */
public class FrustratedCoders {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] array = new int[N];
		Stack stack = new Stack(N);
		for (int i = 0; i < N; i++) {
			array[i] = s.nextInt();
		}
		Arrays.sort(array);
		int currentKiller = array[N - 1];
		int currentKillerIndex = N - 1;
		for (int i = N - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				stack.push(array[i]);
			} else if (currentKiller > array[i]) {
				currentKillerIndex--;
				currentKiller = array[currentKillerIndex];
			} else if (currentKiller == array[i]) {
				stack.push(array[i]);
			}
		}
		System.out.println(stack.sum());
	}
}

class Stack {
	private int[] stackArray;
	private int top = -1;

	public Stack(int size) {
		stackArray = new int[size];
	}

	public void push(int item) {
		if (top != stackArray.length - 1) {
			stackArray[++top] = item;
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int sum() {
		int arraySum = 0;
		for (int i = 0; i < stackArray.length; i++) {
			int value = stackArray[i];
			if (value > 0) {
				arraySum = arraySum + value;
			}
		}
		return arraySum;
	}
}
