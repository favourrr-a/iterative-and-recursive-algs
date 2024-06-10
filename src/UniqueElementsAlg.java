public class UniqueElementsAlg {
    public static Boolean uniqueElements(int[] array){
        Boolean isUnique = true;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    isUnique = false;
                    break;
                }
            }
            if(!isUnique){
                break;
            }
        }
        return isUnique;
    }
}
