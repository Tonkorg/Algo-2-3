package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.nanoTime;

public class Algo_9_variant_3_laba {

        public static int Search(ArrayList array, int key,int count)  // пробежка по рекурсии
        {
            if (count >array.size())
            {
                return -1;
            }

            if(array.get(count).equals(key))
            {
                return count;
            }

            return  Search(array,key,count+1);
        }

       /* public static ArrayList FillArray(ArrayList arrayList, int lenght, int count)
        {
            Scanner scanner = new Scanner(System.in);
            if(count == lenght -1)
            {
                return arrayList;
            }
            System.out.println("Введите " + (count+1) + " Элемент ");
            arrayList.add(scanner.nextInt());


            return FillArray(arrayList, lenght, count +1);
        }*/


    public static void main(String[] args) {

        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        ArrayList array = new ArrayList();

        //int count_v1 = 0;
        for ( int i = 0; i< len; i++)
        {
            System.out.println("Введите " + (i+1) + " Элемент ");
            array.add( scanner.nextInt());
        }
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        int count = 0;

        long startTime = nanoTime();
        System.out.println(" Элемент под номером " + (Search(array,key,count)+1) + " является искомым");
        long finishTime = nanoTime();
        long res = finishTime - startTime;
        System.out.println(" время выполнения " + res);
        //System.out.println(" Элемент под номером " + (Search(FillArray(array,len, count_v1),key,count)+1) + " является искомым");
    }

}
