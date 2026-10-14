public  class Main{
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2,2);
        Matrix matrix2 = new Matrix(2,2);

        matrix1.matrix[0][0] = 1;
        matrix1.matrix[0][1] = 2;
        matrix1.matrix[1][0] = 3;
        matrix1.matrix[1][1] = 4;

        matrix2.matrix[0][0] = 9;
        matrix2.matrix[0][1] = 9;
        matrix2.matrix[1][0] = 9;
        matrix2.matrix[1][1] = 9;

        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();

        System.out.println();
        matrix1.addMatrix(matrix2);
        matrix1.printMatrix();









    }



}
