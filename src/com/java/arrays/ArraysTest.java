package com.java.arrays;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] ids = new int[5];
        ids[0] = 10;
        ids[1] = 20;
        ids[2] = 30;
        ids[3] = 40;
        ids[4] = 50;
// for print all elements in single using loop
        for (int i = 0; i < ids.length; i++) {
            System.out.print(ids[i] + " ");
        }

        // for print all elements in single line
        System.out.println(Arrays.toString(ids));
        // print all elements in a row
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }
// sum of all elements but not recommended
        System.out.println(ids[0] + ids[1] + ids[2] + ids[3] + ids[4]);// also it works but large data take time to take all so we use loops
// sum of all elements
        int sum = 0;
        for (int i = 0; i < ids.length; i++) {
            sum = sum + ids[i];

        }
        System.out.println(sum);
        // Average of all elements
        int sum1 = 0;

        for (int i = 0; i < ids.length; i++) {
            sum1 = sum1 + ids[i];



        }
        double average = (double) sum1 / ids.length;

        System.out.println("Average = " + average);
    }
}
