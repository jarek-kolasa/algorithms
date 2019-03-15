package algorithms.beginnersLevel;

public class Dominant {
    public int dominantValue(int[] values) {

        if (values == null || values.length == 0) {
            return 0;
        }

        int[] checkIfValuesExist = new int[values.length];
        int[] quantityOfValues = new int[values.length];
        int index = 0;
        int quantity = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < checkIfValuesExist.length; j++) {
                if (checkIfValuesExist[j] == values[i]) {
                    quantityOfValues[j]++;
                    break;
                } else if (j == values.length-1) {
                    checkIfValuesExist[index] = values[i];
                    quantityOfValues[index] = 1;
                    index++;
                    quantity++;
                }
            }
        }

        int dominant = 0;
        int counter = 0;
        for (int i = 0; i < quantityOfValues.length; i++) {
            if(quantityOfValues[i] > quantityOfValues[dominant]){
                dominant = i;
                counter = 1;
            } else if (quantityOfValues[i] == quantityOfValues[i]){
                counter++;
            }
        }

        return checkIfValuesExist[dominant];
    }
}
