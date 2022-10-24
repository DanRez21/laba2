package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Matrix<Integer> mat = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix<Integer> mat2 = new Matrix<>(new Matrix<>(2, 2, Arrays.asList(1, 2, 3, 4)));
        Matrix<Integer> mat3 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        Matrix<String> mat5 = new Matrix<>(new Matrix<>(3, 3, Arrays.asList("a", "b", "c", "d", "e", "f", "g", "j", "h")));
        Matrix a = new Matrix<>();
        //ImmutableMatrix<Integer> mat4 = new ImmutableMatrix<>(new ImmutableMatrix<>(3, 3, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        //printMatrix(a.rowMatrix(5));
        System.out.println(mat.hashCode());
        System.out.println(mat2.hashCode());
        System.out.println(mat5.getElement(2,2));


        a = new Matrix<>(mat);
        a.transposed().print();
    }

    private static void printMatrix(int[][] arr) {
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