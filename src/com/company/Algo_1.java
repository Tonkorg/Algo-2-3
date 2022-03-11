package com.company;

import static java.lang.System.nanoTime;

public class Algo_1 {
        public static void main(String[] args) {


            int n =130;
            int[] mas = new int[n];
            int multyCo = 1, multy = 1;

            for (int i = 0; i < n; i++) {
                mas[i] = (int) (Math.random() * 10);
            }

            long startTime = nanoTime();

            for (int i = 0; i < mas.length; i++) {
                int nim = mas[i];
                if (nim % 2 == 0) { //2
                    multyCo *= nim; //2
                }
                else  {
                    multy *= nim; //2   f = 2 + 2 = 4 +3 = 7
                }
                // 10n +1
                //
                // O(n)
            }
            long endTime = nanoTime();

            long res = endTime - startTime;

            System.out.println(res);
        }
    }


