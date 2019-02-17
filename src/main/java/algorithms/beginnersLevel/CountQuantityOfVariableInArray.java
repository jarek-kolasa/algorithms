package algorithms.beginnersLevel;

public class CountQuantityOfVariableInArray {

	public int countVariablesQuantity(int[] array, int value) {
		
		int quantity = 0;
		
		if(array == null) {
			return 0;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				quantity++;
			}
		}
		
		return quantity;
	}

}
