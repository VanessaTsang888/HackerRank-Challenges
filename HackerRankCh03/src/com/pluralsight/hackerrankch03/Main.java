package com.pluralsight.hackerrankch03;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        /* To confirm if the below 3 statements are even numbers (not Weird).
         n divided by 2 and what is left equals to 0. Therefore, a even number.*/

        // Constraints: n is greater and equals to 1 and n is less than and equals to 100. If true then run the below if-statement code block.
        if (n >= 1 && n <= 100) {

            if (n % 2 == 0) { // using the equality operator not the assignment operator.
                // Below x3 are nested statements as they are all checking for even numbers.

                if (n == 2 || n == 4) {
                    System.out.println("Not Weird");
                } else if (n > 5 && n <= 20) {
                    System.out.println("Weird");
                } else if (n > 20) {
                    System.out.println("Not Weird");
                }
                // If the input is not even, then the below will execute as it must be odd - Weird.
            } else {
                System.out.println("Weird");
            }
            // Not required by the problem but coded to handle all ints including 0 and negative even numbers i.e. -2.
        } else {
            System.out.println("Unknown Number. Please enter a valid number between 1 to 100.");
        }

    }
}
