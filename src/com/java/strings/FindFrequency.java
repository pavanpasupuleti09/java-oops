package com.java.strings;

public class FindFrequency {


    public static void main(String[] args) {


            String str = "Programming";

            char target = 'g';

            int count = 0;

            for(int i = 0; i < str.length(); i++){

                if(str.charAt(i) == target)
                    count++;
            }

            System.out.println(count);
        }
    }

