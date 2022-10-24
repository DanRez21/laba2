package org.example;
import java.util.ArrayList;
import java.util.List;

public class MutableMatrix<T extends Number> extends Matrix<T>
{
/*
    //конструктор для пустої матриці
    public MutableMatrix()
    {
        super();
    }

    //конструктор для матриці з заданими розмірами
    public MutableMatrix(int height, int width)
    {
        super(height, width);
    }

    //конструктор для копіювання матриці
    public MutableMatrix(Matrix<T> matrix){
        super(matrix);
    }

    //для заповнення матриці
    public MutableMatrix(int row, int column, List<T> numbers) throws IllegalArgumentException
    {
        super(row, column, numbers);
    }


    public void fillMatrix(List<T> numbers) throws IllegalArgumentException
    {

        //type = numbers.get(0).getClass();

        //filled = true;

        int counter = 0;
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                m.get(i).set(j, numbers.get(counter));
                counter++;
            }
        }
    }*/
}