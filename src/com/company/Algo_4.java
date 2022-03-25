package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.nanoTime;

public class Algo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int len  = scanner.nextInt();
        int[] array = new int[len];
        System.out.println("Выберите сортировку");
        System.out.println("1: Пузырек" );
        System.out.println("2 : Быстрый поиск");
        int choose = scanner.nextInt();
        boolean f = true;
        fillArray(array);
        while (f)
        switch (choose)
        {
            case 1:
                long startTime = nanoTime();
                SortFist(array);
                long finishTime = nanoTime();
                System.out.println("Время выполнения " + (finishTime-startTime) + " наносекунд");
                f = false;
                break;
            case 2:
                long startTime_v1 = nanoTime();
                SortSecond(array);
                long finishTime_v1 = nanoTime();
                System.out.println("Время выполнения " + (finishTime_v1-startTime_v1) + " наносекунд");

                f = false;
                break;
            default:
                System.out.println("Неверное значение");
        }

    }

    public static void SortFist(int[] array)
    {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    public static void SortSecond(int [ ] array)
    {

       Arrays.sort(array);
       System.out.println(Arrays.toString(array));
    }
    public static int[] fillArray(int[] array)
    {

        for ( int i = 0; i < array.length; i ++)
        {
            array[i] = (int)(Math.random() * 100 + 1);
        }
        return array;
    }
}
