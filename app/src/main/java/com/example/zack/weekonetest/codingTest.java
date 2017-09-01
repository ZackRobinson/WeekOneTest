package com.example.zack.weekonetest;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Zack on 9/1/2017.
 */

public class codingTest {


    private static final String TAG = "MainActivityTag";


    public static void main(String[] args) {
        // Methods and values for palindrome question
        String palindrome = "racecar";
        String notAPalindrome = "Zack";
        Log.d(TAG, "onCreate: " + testPalindrome(palindrome));
        Log.d(TAG, "onCreate: " + testPalindrome(notAPalindrome));

        // Methods and values for mode question
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(2);
        obj.add(2);
        obj.add(2);
        obj.add(3);
        obj.add(3);
        obj.add(1);

        Log.d(TAG, "onCreate: " + findLargestMode(obj));


        // Methods and values for Armstrong number question
        // testArmstrongNum only accepts 3 digit values right now
        String armStrongNumber = "153";
        String anotherArmStrongNumber = "371";
        String notAnArmStrongNumber = "222";
        Log.d(TAG, "onCreate: " + testArmstrongNum(armStrongNumber));
        Log.d(TAG, "onCreate: " + testArmstrongNum(anotherArmStrongNumber));
        Log.d(TAG, "onCreate: " + testArmstrongNum(notAnArmStrongNumber));

    }

    //Method to tell you if a string is a palindrome
    public static boolean testPalindrome(String string) {
        String reverse = "";
        for (int i = string.length(); i > 0; i--) {
            reverse += string.charAt(i);
        }
        if (reverse == string)
            return true;
        else
            return false;

    }

    //Create a function to find the most occurrence of a integer value given an integer array/list.
    public static int findLargestMode(ArrayList arrayList) {
        int largestMode = arrayList.indexOf(0); // The number with the most duplicates
        int largestModeCount = 0; // The number of duplicates
        int contender; // The number that might have the most duplicates
        int contenderCount = 0; // The number of duplicates

        for (int i = arrayList.size(); i > 0; i--) {
            contender = arrayList.indexOf(i);
            for (int x = arrayList.size(); i > 0; i--) {
                if (contender == arrayList.indexOf(x)) {
                    contenderCount++;
                }
            }
            if (contenderCount >= largestModeCount) {
                largestMode = contender;
                largestModeCount = contenderCount;
            }
        }

        return largestMode;
    }

    //Simple Java Program to check or find if a number is Armstrong number or not.
    //An Armstrong number of three digit is a number whose sum of cubes of its digit is equal to its number.
    //  For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
    public static boolean testArmstrongNum(String num) {
        int power = num.length() + 1;
        int value = Integer.getInteger(num);
        int a = Integer.getInteger(String.valueOf(num.charAt(0)));
        int b = (int) num.charAt(1);
        int c = (int) num.charAt(2);
        int v = (int) (Math.pow(a, power) + Math.pow(b, power) + Math.pow(c, power));

        if (value == v) {
            return true;
        } else
            return false;
    }
}
