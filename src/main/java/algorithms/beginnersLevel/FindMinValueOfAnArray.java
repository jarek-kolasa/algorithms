package algorithms.beginnersLevel;

public class FindMinValueOfAnArray {

	public int minValueOfArray(int[] array) {

		if (array == null || array.length == 0) {
			return 0;
		}

		int minValue = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}

		return minValue;
	}

}
