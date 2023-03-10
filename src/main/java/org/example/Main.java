package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Matrix<Integer> mat1 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix<Integer> mat2 = new Matrix<>(new Matrix<>(2, 2, Arrays.asList(1, 2, 3, 4)));
        Matrix<Integer> mat3 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix mat4 = new Matrix<>(2, 2, Arrays.asList(2, 'a', "c", "d"));
        Matrix mat6 = new Matrix<>(2, 2, Arrays.asList("b", 'd', "c", "d"));
        mat4.sum(mat6).print();
        //ImmutableMatrix<Integer> mat5 = new ImmutableMatrix<>(new Matrix<>(2, 3, Arrays.asList(1, 2, 3, 4, 5, 6)));

        /* пуста матриця
        Matrix a = new Matrix<>();
        a.print();
        */

        //матриця заданим розміром
        /*Matrix<Integer> matrix = new Matrix<>(new Matrix<>(2, 5, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        matrix.print();
        ImmutableMatrix a = new ImmutableMatrix<>(matrix);
        a.print();*/
        //System.out.println(a.equals(matrix));
        //mat4.sum(mat6).print();
        /*mat4.print();
        mat4.transposed().print();*/

        /* заповнення матриці значеннями
        Matrix<Integer> a = new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
         */

        //копіювання матриці
        /*Matrix<Integer> a = new Matrix<>(mat1);
        a.print();
        ImmutableMatrix<Integer> b = new ImmutableMatrix<>(mat1);
        b.print();
        System.out.println(b.equals(a));*/

        /*вивід елемента, рядка, стовпця
        System.out.println(mat1.getElement(1,1));
        System.out.println(mat1.getRow(1));
        System.out.println(mat1.getColumn(0));*/

        /*отримання розмірності
        Matrix a = new Matrix<>(3,4);
        System.out.println(a.getDimension()[0] + " * " + a.getDimension()[1]);
        */

        /*метод equals та hashCode
        System.out.println(mat1.hashcode());
        System.out.println(mat2.hashcode());
        System.out.println(mat3.hashcode());

        System.out.println(mat1.equals(mat2));
        System.out.println(mat1.equals(mat3));
         */

        /*матриця-рядок
        Matrix a = new Matrix<>(2,3);
        printMatrix(a.rowMatrix(4));
        */

        /*транспонування
         mat1.transposed().print();
        */

    }

    private static void printMatrix(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

    private static void printArrayI(List<Integer> arr)
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printArrayS(List<String> arr)
    {
        for (String i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}