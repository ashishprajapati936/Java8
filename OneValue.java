import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

class OneValue {

	public static List<Integer> intList = new ArrayList<Integer>();

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		for (int i = 0; i < M; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(tk.nextToken());
			if (type == 1) {
				int val = Integer.parseInt(tk.nextToken());
				add_to_list(val);
			} else if (type == 2) {
				int val = Integer.parseInt(tk.nextToken());
				remove_from_list(val);
			} else if (type == 3) {
				int ans = find_least_frequency();
				System.out.println(ans);
			} else if (type == 4) {
				int ans = find_highest_frequency();
				System.out.println(ans);
			}
		}
	}

	public static void add_to_list(int val) {
		// Process queries of type 1 here
		intList.add(val);
	}

	public static void remove_from_list(int val) {
		// Process queries of type 2 here
		if (intList != null && intList.size() != 0 && intList.contains(val)) {
			int index = intList.indexOf(val);
			intList.remove(index);
		}
	}

	public static int find_least_frequency() {
		// Process queries of type 3 here
		if (intList.size() == 0)
			return -1;
		Map<Integer, Long> groupedMap = intList.parallelStream()
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));
		return groupedMap.entrySet().parallelStream().max((entry1,
				entry2) -> (entry1.getValue() < entry2.getValue()
						|| (entry1.getValue() == entry2.getValue() && entry1.getKey() > entry2.getKey())) ? 1 : -1)
				.get().getKey();

	}

	public static int find_highest_frequency() {
		// Process queries of type 4 here
		if (intList.size() == 0)
			return -1;
		Map<Integer, Long> groupedMap = intList.parallelStream()
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));
		return groupedMap.entrySet().parallelStream().max((entry1,
				entry2) -> (entry1.getValue() > entry2.getValue()
						|| (entry1.getValue() == entry2.getValue() && entry1.getKey() > entry2.getKey())) ? 1 : -1)
				.get().getKey();

	}
}