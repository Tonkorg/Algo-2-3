package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.nanoTime;

    public class Alg {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What's count of number");
            int count = sc.nextInt();
            System.out.println("What's start number");
            int startNumber = sc.nextInt();
            int key = key();
            long resultTime[] = new long[count];


            for (int i = 0; i< count; i++) {
                long  startTime = nanoTime();
                int probe = interpolationSearch(input(startNumber), key);

                long endTime = nanoTime();
                resultTime[i] = endTime-startTime;
                System.out.println("Time for " + startNumber + " element = " +resultTime[i]);
                if (probe == -1) {
                    System.out.println("Element not found");
                } else {
                    System.out.println("Your element number " + (probe + 1));
                }
                startNumber+=5;

            }
            int res = 0;
            for(Long time:resultTime)
            {
                res+=time;
            }
            System.out.println("Result time = " + res);

        }

        public static int interpolationSearch(int[] data, int item) {

            int highEnd = (data.length - 1);
            int lowEnd = 0;

            while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {

                int probe
                        = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]); //22

                if (highEnd == lowEnd) {     //1
                    if (data[lowEnd] == item) {
                        return lowEnd;  //4     1+2+0,5 =3,5
                    } else {
                        return -1;  //1
                    }
                }

                if (data[probe] == item) { //4
                    return probe;
                }

                if (data[probe] < item) { //5  // 4 + 5 + 2  + 1 =12
                    lowEnd = probe + 1;
                } else {
                    highEnd = probe - 1; //2
                }
            }
            return -1; //1
        } //25+12 = 27   f(n) = 1+3*n +n*22 + 3 =( если n = 10) f(n) = 1+30+220+3 = 254


        public static int[] input(int startNumber)
        {
            int num = (int) (startNumber);
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100 + 1);

                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (arr[i] == arr[j]) {
                        i--;
                    }
                }
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            return arr;
        }

        public static int key()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input key");
            return sc.nextInt();
        }
    }



// 2 лабораторная работа по Алгоритмам 5 вариант
