package com.java.strings;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Programming";
        int i ;
        int count = 0;
        for (i = 0;i < input.length();i++){
           char ch = input.charAt(i);

            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){


                count++;

            }

        }
        System.out.println(count);

        }
    }

