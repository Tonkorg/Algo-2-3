package com.company;
import java.util.Scanner;
import static java.lang.System.nanoTime;

    public class Algo_3 {
        public static long  PowA(long num, long degree)
        {
            if (degree==0)
                return 1;
            return PowA(num,degree-1)*num;

        }

        public static void main(String[] args)
        {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.print("Input x (number, which pow in degree) \n");
            int number = myObj.nextInt();
            System.out.print("Start position degree \n");
            int startDegree = myObj.nextInt();
            System.out.print(" Ending position degree \n");
            int endDegree = myObj.nextInt();
            long startTime, endTime, pow;
            for(int i=startDegree;i<=endDegree;i++){
                startTime = nanoTime();
                pow = PowA(number,i);
                endTime = nanoTime();
                System.out.println("Pow(" + number + ", " + i + ") = " + pow);
                System.out.println("Time: "+( endTime - startTime ));
            }
        }
    }

