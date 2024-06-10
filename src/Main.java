
public class Main {
    public static void main(String[] args) {
        int[] array = {9, 6, 1, 21, 3, 22, 1, 7, 7};
        System.out.println("Max element in the array is " + MaxElementAlg.MaxElement(array));
        System.out.println("This array's uniqueness is " + UniqueElementsAlg.uniqueElements(array));
        double[][] matrix1 = {
                {1,2},
                {3,4},
        };
        double[][] matrix2 = {
                {1,3},
                {5,7},
        };
        double[][] result = (MatrixMultiplicationAlg.matrixMultiplication(matrix1, matrix2));
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        double[][] A = {
                {2, 1, -1},
                {-3, -1, 2},
                {-2, 1, 2}
        };
        double[] b = {8, -11, -3};

        double[] solution = GaussianEliminationAlg.gaussianElimination(A, b);

        System.out.println("Solution:");
        for (int i = 0; i < solution.length; i++) {
            int p = i + 1;
            System.out.println("x[" + p + "] = " + solution[i]);
        }
    }
}