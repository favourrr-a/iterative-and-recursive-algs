public class MatrixMultiplicationAlg {
    public static double[][] matrixMultiplication(double[][] matrix1, double[][] matrix2){
        int matrix1Rows = matrix1.length;
        int matrix1Columns = matrix1[0].length;
        int matrix2Columns = matrix2[0].length;
        double[][] multiplicationSolution = new double[matrix1Rows][ matrix1Columns];

        if (matrix1Columns != matrix2.length) {
            throw new IllegalArgumentException("Matrices cannot be multiplied: dimensions mismatch");
        }
        for (int i = 0; i < matrix1Rows; i++) {
            for (int j = 0; j < matrix2Columns; j++) {
                for (int k = 0; k < matrix1Columns; k++) {
                    multiplicationSolution[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiplicationSolution;
    }
}
