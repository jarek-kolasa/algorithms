package algorithms.beginnersLevel;

public class BinarySearch {

	public int findValue(int searchedValue, int[] array) {

		if (array == null) {
			return -1;
		}

		int l = 0;
		int p = array.length-1;
		int s;

		while (l <= p){
			s= (l+p)/2;
			if(array[s] == searchedValue){
				return array[s];
			} else if (array[s] > searchedValue) {
				p = s-1;
			} else {
				l = s+1;
			}
		}
		return -1;
	}

}
