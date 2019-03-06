package algorithms.beginnersLevel;

public class SumOfIntegers {
    public int sumOfIntegers(int value) {

        int result = 0;

        while(value != 0){
            result += value%10;
            value /= 10;
        }

        return result;
    }
}
