import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastOccurrence {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] line1 = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int N = line1[0];
		int M = line1[1];
		int[] array = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int lastValue = IntStream.range(0, N).filter(i -> M == array[i]).reduce((a, b) -> b).orElse(-1);
		System.out.println(lastValue + 1);
	}
}
