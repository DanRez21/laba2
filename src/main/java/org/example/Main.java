package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Matrix<Integer> mat1 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix<Integer> mat2 = new Matrix<>(new Matrix<>(2, 2, Arrays.asList(1, 2, 3, 4)));
        Matrix<Integer> mat3 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix<String> mat4 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList("a", "b", "c", "d", "e", "f", "g", "j", "h")));
        ImmutableMatrix<Integer> mat5 = new ImmutableMatrix<>(new Matrix<>(2, 3, Arrays.asList(1, 2, 3, 4, 5, 6)));
        /* пуста матриця
        Matrix a = new Matrix<>();
        a.print();
        */

        /* матриця заданим розміром
        Matrix a = new Matrix<>(3,4);
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
}