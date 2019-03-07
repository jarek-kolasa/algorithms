package algorithms.beginnersLevel;

public class ArithmeticAverage {
    public double calculateArithmeticalAverage(int[] array) {

        if(array == null || array.length == 0){
            return  0;
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum/array.length;
    }
}
