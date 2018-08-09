import java.util.Scanner;

/**
 * Like linear search and binary search, ternary search is a searching technique
 * that is used to determine the position of a specific value in an array. In
 * binary search, the sorted array is divided into two parts while in ternary
 * search, it is divided into 3 parts and then you determine in which part the
 * element exists.
 * 
 * Ternary search, like binary search, is a divide-and-conquer algorithm. It is
 * mandatory for the array (in which you will search for an element) to be
 * sorted before you begin the search. In this search, after each iteration it
 * neglects 1/3rd part of the array and repeats the same operations on the
 * remaining 2/3.
 * 
 * This concept is used in unimodal functions to determine the maximum or
 * minimum value of that function. Unimodal functions are functions that, have a
 * single highest value.
 * 
 * @author Ashish
 *
 */
public class TernarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println((long) ternarySearch(s.nextInt(), s.nextInt()));

		}
		s.close();
	}

	private static double ternarySearch(double start, double end) {
		double low = start;
		double high = end;
		for (int i = 0; i < 200; i++) {
			double mid1 = (low * 2 + high) / 3;
			double mid2 = (low + 2 * high) / 3;
			if (unimodalFunction(mid1) < unimodalFunction(mid2)) {
				high = mid2;
			} else {
				low = mid1;
			}
		}
		double x = low;
		return Math.round(unimodalFunction(x));

	}

	private static double unimodalFunction(double x) {
		return (2 * x * x) - (12 * x) + 7;
	}

}
