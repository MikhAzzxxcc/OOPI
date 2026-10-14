public class Matrix {

    double matrix[][];
    int rows;
    int coluwns;

    public Matrix(int rows, int coluwns){
        this.coluwns = coluwns;
        this.rows = rows;
        this.matrix = new double[rows][coluwns];

    }

    public void addMatrix(Matrix otherMatrix){

        if (rows != otherMatrix.rows || coluwns != otherMatrix.coluwns) {
            System.out.println("Матрицы должны быть одинакового размера!");
            return;
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coluwns; j++) {
                matrix[i][j] += otherMatrix.matrix[i][j];

            }
        }

    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coluwns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
