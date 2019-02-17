package algorithms.beginnersLevel;

public class SumOfAnArray {

	public int checkSumOfAnArray(int[] values) {
		
		int sum = 0;
		
		if(values == null) {
			return 0;
		}
		
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}

}
