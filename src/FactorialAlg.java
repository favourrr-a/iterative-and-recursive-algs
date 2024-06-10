public class FactorialAlg {
    public static int factorial(int number){
        int factorial = 1; // factorial of zero is one so this covers that too
        if(number < 0){
            throw new IllegalArgumentException("Factorials only work for positive numbers");
        }
        else{
            for(int i = number; i > 0; i--){
                factorial *= i;
            }
        }
        return factorial;
    }
}
