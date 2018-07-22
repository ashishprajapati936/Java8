import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = s.nextInt();
		}
		Arrays.sort(array);
		int q = s.nextInt();
		int[] queries = new int[q];
		int low = 0;
		int high = N - 1;
		for (int i = 0; i < q; i++) {
			queries[i] = s.nextInt();
			int a = binarySearch(low, high, queries[i], array);
			System.out.println(a + 1);
		}
		s.close();
	}

	private static int binarySearch(int low, int high, int key, int[] array) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
