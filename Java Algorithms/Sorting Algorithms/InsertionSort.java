import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Insertion sort is based on the idea that one element from the input elements
 * is consumed in each iteration to find its correct position i.e, the position
 * to which it belongs in a sorted array.
 * 
 * It iterates the input elements by growing the sorted array at each iteration.
 * It compares the current element with the largest value in the sorted array.
 * If the current element is greater, then it leaves the element in its place
 * and moves on to the next element else it finds its correct position in the
 * sorted array and moves it to that position. This is done by shifting all the
 * elements, which are larger than the current element, in the sorted array to
 * one position ahead
 * 
 * In worst case,each element is compared with all the other elements in the
 * sorted array. For N elements, there will be N^2 comparisons. comparisons.
 * Therefore, the time complexity is O(N^2),
 * 
 * 
 * 
 * @author Ashish
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		int[] sortedArray = insertionSort(arr);
		IntStream.of(sortedArray).forEach(x -> System.out.print(x + " "));
	}

	private static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}

}
