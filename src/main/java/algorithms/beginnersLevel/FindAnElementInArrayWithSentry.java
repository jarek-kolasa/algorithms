package algorithms.beginnersLevel;

public class FindAnElementInArrayWithSentry {

	public int findTheElementInArray(int value, int[] array) {
		
		if(array == null || array.length == 0) {
			return -1;
		}

		int [] sentryArray = new int [array.length+1];
		
		for (int i = 0; i < sentryArray.length; i++) {
			if(i < sentryArray.length -2) {
			sentryArray[i] = array[i];
			}
			if(i == sentryArray.length-1) {
				sentryArray[i] = value;
			}
		}
		
		for (int i = 0; i < sentryArray.length; i++) {
			if (sentryArray[i] == value) {
				if(i == sentryArray.length-1) {
					return -1;
				} else {
					return i;
				}
			}
		}
		
		return -1;
	}

}
