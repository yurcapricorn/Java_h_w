import java.util.Arrays;

/**
 * Created by user on 15-Nov-16.
 */
public class matrix {

    public static void main(String[] args){

     //   Matrix a = new Matrix(10,10);
     //   Matrix.print(a);

        Matrix b = new Matrix(5,5,10);
     //   Matrix.print(b);

     //   Matrix c = new Matrix(b);
     //   Matrix.print(c);

     //   Matrix.print(Matrix.add(b,b));

     //   Matrix.print(Matrix.sub(b,b));

        Matrix.print(Matrix.mult(b,b));

    }

    public static class Matrix {                      //переменные класса
        protected int[][] arr;

        public Matrix(int a, int b){                 //конструкторы
            int[][] arr =new int[a][b];
            this.arr=arr;
        }
        public Matrix(int a, int b, int c){
            int[][] arr = new int[a][b];
            for (int i=0;i<arr.length;i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = c;
                }
            }
            this.arr=arr;
        }
        public Matrix(int[][] c){
            int[][] arr2 = new int[c.length][c[0].length];
            for (int i=0;i<c.length;i++){
                for (int j=0;j<c[0].length;j++){
                    arr2[i][j]=c[i][j];
                }
            }
            this.arr=arr2;
        }
        public Matrix(Matrix matrix){
            this.arr=matrix.arr;
        }

        public int[][] getArr(){                  //методы
            return this.arr;
        }

        public static void print(Matrix matrix){
            int[][] arr = matrix.arr;
         //   System.out.println(arr.length+"x"+arr[0].length);
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static Matrix add(Matrix m1, Matrix m2){
            int[][] arr1 = m1.getArr();
            int[][] arr2 = m1.getArr();
            int a = arr1.length;
            int b = arr1[0].length;
            int[][] arr3 = new int[a][b];
            for (int i=0;i<a;i++){
                for (int j=0;j<b;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            Matrix m3 = new Matrix(arr3);
            return m3;
        }
        public static Matrix sub(Matrix m1, Matrix m2){
            int[][] arr1 = m1.getArr();
            int[][] arr2 = m1.getArr();
            int a = arr1.length;
            int b = arr1[0].length;
            int[][] arr3 = new int[a][b];
            for (int i=0;i<a;i++){
                for (int j=0;j<b;j++){
                    arr3[i][j]=arr1[i][j]-arr2[i][j];
                }
            }
            Matrix m3 = new Matrix(arr3);
            return m3;
        }
        public static Matrix mult(Matrix m1, Matrix m2){
            int[][] arr1 = m1.getArr();
            int[][] arr2 = m1.getArr();
            int a = arr1.length;
            int b = arr2[0].length;
            int c = arr1[0].length;
            int[][] arr3 = new int[a][b];
            for (int i=0;i<a;i++){
                for (int j=0;j<b;j++){
                    for (int k=0;k<c;k++){
                        arr3[i][j]+= arr1[i][k] * arr2[k][j];
                    }
                }
            }
            Matrix m3 = new Matrix(arr3);
            return m3;
        }
    }
}
