import static java.lang.Math.abs;

public class CountingBinaryDigitsAlg {
    public static int countingBinaryDigits(int decimalNumber){
        int numberOfBinaryDigits = 0;
        if(decimalNumber == 0){
            numberOfBinaryDigits = 1;
        }
        else{
            decimalNumber = abs(decimalNumber);
            while(decimalNumber > 0){
                decimalNumber/=2;
                numberOfBinaryDigits++;
            }
        }
        return numberOfBinaryDigits;
    }
}
