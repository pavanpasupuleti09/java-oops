package com.java.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] ids ={2,4,9,5,3};
        int largest = ids[0];
        for(int i = 1; i < ids.length;i++ ){
            if(ids [i]> largest){
                largest = ids[i];
            }
        }
        System.out.println(largest);


    }
    }

