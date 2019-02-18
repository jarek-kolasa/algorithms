package algorithms.beginnersLevel;

public class FindAnElementInArray {

	public int findTheElementInArray(int value, int[] array) {
		
		if (array == null || array.length == 0) {
			return -1;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

}
