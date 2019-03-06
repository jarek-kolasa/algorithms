package algorithms.beginnersLevel;

public class Exponentiation {
    public double toThePower(int value, int power) {

        double result = 1;

        if (power == 0) {
            return 1;
        }

       if(power > 0){
           while (power > 0){
               result *= value;
               power --;
           }
       } else if (power < 0){
            while (power < 0){
                result *= value;
                power ++;
            }
            result = 1/result;
       }

        return result;
    }
}
