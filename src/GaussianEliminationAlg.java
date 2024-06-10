public class GaussianEliminationAlg {

    public static double[] gaussianElimination(double[][] A, double[] b) {
        int n = b.length;

        for (int i = 0; i < n; i++) {
            int pivot = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(A[j][i]) > Math.abs(A[pivot][i])) {
                    pivot = j;
                }
            }

            double[] temp = A[i];
            A[i] = A[pivot];
            A[pivot] = temp;

            double t = b[i];
            b[i] = b[pivot];
            b[pivot] = t;

            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                b[j] -= factor * b[i];
                for (int k = i; k < n; k++) {
                    A[j][k] -= factor * A[i][k];
                }
            }
        }
        double[] variables = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * variables[j];
            }
            variables[i] = (b[i] - sum) / A[i][i];
        }
        return variables;
    }
}