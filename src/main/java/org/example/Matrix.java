package org.example;

import java.lang.Math;
import java.util.List;
import java.util.ArrayList;


public class Matrix<T>
{
    public int height, width;
    public List<List<T>> m;

    //конструктор для створення пустої матриці
    public Matrix()
    {
        m = new ArrayList<>();
        height = 0;
        width = 0;
    }

    //конструктор для створення матриці заданого розміру
    public Matrix(int height, int width)
    {
        this.height = height;
        this.width = width;

        m = new ArrayList<>();
        //заповнення матриці
        for (int i = 0; i < height; i++)
        {
            m.add(new ArrayList<>());
            for (int j = 0; j < width; j++)
            {
                m.get(i).add(null);
            }
        }
    }

    //конструктор для копіювання матриці
    public Matrix(Matrix<T> matrix)
    {
        height = matrix.height;
        width = matrix.width;

        m = new ArrayList<>();
        for (int i = 0; i < height; i++)
        {
            m.add(new ArrayList<>());
            for (int j = 0; j < width; j++)
            {
                m.get(i).add(matrix.getElement(i, j));
            }
        }
    }

    public Matrix(int height, int width, List<T> elem)
    {
        this.height = height;
        this.width = width;

        m = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < height; i++)
        {
            m.add(new ArrayList<>());
            for (int j = 0; j < width; j++)
            {
                m.get(i).add(elem.get(n));
                n++;
            }
        }
    }

    public T getElement(int height, int width) throws IllegalArgumentException
    {
        if (this.height < height || this.width < width || height < 0 || width < 0)
        {
            throw new IllegalArgumentException();
        }

        return m.get(height).get(width);
    }

    public List<T> getRow(int height) throws IllegalArgumentException
    {
        if (this.height < height || height < 0)
        {
            throw new IllegalArgumentException();
        }

        return m.get(height);
    }

    public List<T> getColumn(int width) throws IllegalArgumentException
    {
        if (this.width < width || width < 0)
        {
            throw new IllegalArgumentException();
        }

        List<T> column = new ArrayList<>();
        for (List<T> row : m)
        {
            column.add(row.get(width));
        }
        return column;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof Matrix<?> matrix))
        {
            return false;
        }

        if (height != matrix.height || width != matrix.width)
        {
            return false;
        }

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (!m.get(i).get(j).equals(matrix.getValues().get(i).get(j)))
                {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        if (height == 0 || width == 0)
        {
            return 0;
        }

        int hash = 1;
        for (List<T> list : m)
        {
            hash = 31 * hash + list.hashCode();
        }

        return hash;
    }

    public static int[][] rowMatrix(int size)
    {
        int[][] m = new int[1][size];

        for (int j = 0; j < size; j++)
        {
            m[0][j] = (int) (Math.random()*100);
        }

        return m;
    }

    public Matrix<T> transposed()
    {
        ArrayList<T> transposeValues = new ArrayList<>();

        for (int j = 0; j < width; j++)
        {
            for (int i = 0; i < height; i++)
            {
                transposeValues.add(m.get(i).get(j));
            }
        }
        return new Matrix<>(width, height, transposeValues);
    }

    public void print()
    {
        for (List<T> list : m)
        {
            System.out.println(list.toString());
        }
        System.out.println();
    }

    public final int getHeight()
    {
        return height;
    }

    public final int getWidth()
    {
        return width;
    }

    public final int[] getDimension()
    {
        return new int[] {height, width};
    }

    public final List<List<T>> getValues()
    {
        return m;
    }
}