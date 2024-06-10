public class FibonacciAlg {
    public static int[] fibonacci(int noOfTerms){
        int[] sequence = new int[noOfTerms];
        if(noOfTerms <= 0){
            throw new IllegalArgumentException("Number of terms must be greater than zero");
        }
        if(noOfTerms >= 1){
            sequence[0] = 0;
        }
        if(noOfTerms >= 2){
            sequence[1] = 1;
        }
        for (int i = 2; i < noOfTerms; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }
}
