import java.util.Scanner;

/**
 * Bubble sort is based on the idea of repeatedly comparing pairs of adjacent
 * elements and then swapping their positions if they exist in the wrong order.
 * 
 * The complexity of bubble sort is O(n^2) in both worst and average cases,
 * because the entire array needs to be iterated for every element.
 * 
 * 
 * 
 * @author Ashish
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}

		// to print count of swaps required for sorting
		System.out.println(bubbleSort(arr));
	}

	private static int bubbleSort(int arr[]) {
		int temp;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}
		}
		return count;
	}

}
