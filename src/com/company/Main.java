package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(input()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите аргумент");
        int key = scanner.nextInt();

        System.out.println(interpolationSearch(input(),2));
        /*if(search(input(),key) ==-1)
        {
            System.out.println("element not found");

        }
        else
            {
                System.out.println("Number of elements: " + interpolationSearch(input(),key));
                System.out.println("Number of elements: " + search(input(),key));
        }
    }

    public static int[] input()
    {
        int n = (int) ( Math.random() * 100 + 1);
        int [] array = new int[n];

        for ( int i =0; i< array.length; i++)
        {
            array[i] = (int) ( Math.random() * 100 + 1);
        }
        Arrays.sort(array);
        return array;
    }


    public static int search(int[] array, int key)
    {

        int mid, left = 0,right =array.length -1;
        {
            while(array[left] <= key && array[right]>= key && left <= right) {
                mid = left + ((key - array[left]) * (right - left)) / (array[right] - array[left]);
                if (array[mid] < key) {
                    left = mid + 1;
                } else if (array[mid] > key) {
                    right = mid - 1;
                } else return mid;
            }
                if (array[left] ==key)
                {
                    return left;
                }
                else return -1;

            }
        }

    public static int interpolationSearch(int[] data, int item) {

        int highEnd = (data.length - 1);
        int lowEnd = 0;

        while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {

            int probe
                    = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);

            if (highEnd == lowEnd) {
                if (data[lowEnd] == item) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (data[probe] == item) {
                return probe;
            }

            if (data[probe] < item) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }
    }

