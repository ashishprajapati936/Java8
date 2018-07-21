
/*
 * Comment Section Below
 * 
 * Input is as per below
 * 
 * 	day,hour,second,minute
	day = 24 hour
	hour = 60 minute
	minute = 60 second
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class UnitBalancer {
	String myTemp = null;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUnits = br.readLine();
		String[] arrUntits = strUnits.split(",");
		int M = arrUntits.length;
		String[] relations = new String[M - 1];

		for (int index = 0; index < M - 1; index++) {
			relations[index] = br.readLine();
		}
		Map<String, String> mapRelations = new HashMap();
		Stream.of(relations).parallel().forEach(x -> {
			String[] keyValueArr = x.split("=");
			mapRelations.put(keyValueArr[0].trim(), keyValueArr[1].trim());
		});
		List<String> relationsKeys = new ArrayList<>(mapRelations.keySet());
		String lowestUnit = Stream.of(arrUntits).parallel().filter(x -> !relationsKeys.contains(x))
				.collect(Collectors.joining());
		List<String> sortedUnitsLowToHigh = new LinkedList();
		sortedUnitsLowToHigh.add(lowestUnit);

		for (int index = 0; index < M - 1; index++) {
			String low = lowestUnit;
			lowestUnit = mapRelations.entrySet().stream().parallel().filter(x -> x.getValue().contains(low))
					.map(x -> x.getKey()).collect(Collectors.joining());
			sortedUnitsLowToHigh.add(lowestUnit);
		}

		if (sortedUnitsLowToHigh != null && !sortedUnitsLowToHigh.isEmpty() && mapRelations != null
				&& !mapRelations.isEmpty()) {
			StringBuffer strOutput = new StringBuffer();
			strOutput.append("1");
			strOutput.append(sortedUnitsLowToHigh.get(M - 1));
			int value = 1;
			for (int index = M - 1; index > 0; index--) {
				strOutput.append(" = ");
				int val = value;

				String[] intContainingArray = mapRelations.get(sortedUnitsLowToHigh.get(index)).split("\\s+");
				int intValueinArray = 1;
				if (intContainingArray.length == 2) {
					intValueinArray = Integer.parseInt(intContainingArray[0]);
				}
				value = value * intValueinArray;
				val = value;
				strOutput.append(val);
				strOutput.append(sortedUnitsLowToHigh.get(index - 1));
			}
			System.out.println(strOutput.toString());
		}
	}
}
