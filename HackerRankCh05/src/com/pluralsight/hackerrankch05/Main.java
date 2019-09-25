package com.pluralsight.hackerrankch05;

public class Main {

    public static void main(String[] args) {
	// Use loops to help us do some simple math.
        // Starting with number 2 as that is the sample input.
        int N = 2;
        // Will start at 1 then add 1 each iteration until i is greater than 10.
        for (int i = 1; i <= 10; i++) {
            // concatination of strings. Will auto convert ints into string, will auto evaluate formulas.
            System.out.println(N + " x " + i + " = " + N * i);
        }


    }
}
