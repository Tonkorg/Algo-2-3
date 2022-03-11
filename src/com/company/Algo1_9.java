package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.nanoTime;

public class Algo1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input matrix size");
        int size = scanner.nextInt();
        int sum = 0;
        int [][] matrix = new int[size][size];

        System.out.println(  matrixFill(matrix, sum));
        long startTime = nanoTime();
        //sum(matrix);
        long endTime  =nanoTime();
        long resTime = endTime - startTime;
        System.out.println(resTime);


    }

    public static int matrixFill(int [][] matrix, int sum)
    {
        for (int i = 0; i<matrix.length ; i++ )
        {
            for ( int j =0 ; j < matrix[i].length ; j++)
            {
                matrix[i][j] = (int) ( Math.random()*100);
                System.out.print(matrix[i][j] + " ");
                sum +=matrix[i][j];
            }
            System.out.println("");
        }
        return sum;
    }



} // первая лабо по алгоритмам 9 вариант
