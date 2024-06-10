public class TowerOfHanoiAlg {
    public static void towerOfHanoi(int noOfDisks, char fromRod, char toRod, char auxRod){
        if(noOfDisks == 1){
            System.out.println("Move disk from " + fromRod + " " + "to " + toRod);
        }
        else{
            towerOfHanoi(noOfDisks - 1, fromRod, auxRod, toRod);
            System.out.println("Move disk from " + fromRod + " " + "to " + toRod);

            towerOfHanoi(noOfDisks - 1, auxRod, toRod, fromRod);
        }
    }
}
