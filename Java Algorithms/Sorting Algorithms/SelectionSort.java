import java.util.Scanner;

/**
 * The Selection sort algorithm is based on the idea of finding the minimum or
 * maximum element in an unsorted array and then putting it in its correct
 * position in a sorted array.
 * 
 * Time Complexity: To find the minimum element from the array of N elements N-1
 * comparisons are required After putting the minimum element in its proper
 * position, the size of an unsorted array reduces to N-1 and then N-2
 * comparisons are required to find the minimum in the unsorted array.
 * 
 * Therefore (N-1)+(N-2)+(N-3)+....+1 = (N.(N-1)/2) comparisons and N swaps
 * result in the overall complexity of O(N^2).
 * 
 * Input Format
 * 
 * The first line contains two integer N and x denoting the size of the array
 * and the steps of the above algorithm to be performed respectively. The next
 * line contains N space separated integers denoting the elements of the array.
 * 
 *
 * Output Format
 * 
 * Print N space separated integers denoting the state of the array after x
 * steps
 * 
 * 
 * @author Ashish
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int x = s.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		int[] sortedArray = selectionSort(arr, x);
		for (int i = 0; i < N; i++) {
			System.out.print(sortedArray[i] + " ");
		}

	}

	private static int[] selectionSort(int[] arr, int x) {
		int minimum;
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			if (x == 0)
				break;
			minimum = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimum]) {
					minimum = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
			x--;
		}
		return arr;
	}
}
