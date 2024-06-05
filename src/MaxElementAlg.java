public class MaxElementAlg {
    public static int MaxElement(int [] array){
        int max = array[0];
        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Array cannot be null");
        }
        else{
            int noOfIterations = 0;
            while(noOfIterations < array.length){
                if (array[noOfIterations] > max){
                    max = array[noOfIterations];
                }
                noOfIterations++;
            }
        }
        return max;
    }
}
