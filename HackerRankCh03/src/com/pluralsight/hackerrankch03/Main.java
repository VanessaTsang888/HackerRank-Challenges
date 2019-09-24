package com.pluralsight.hackerrankch03;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        // To confirm if the below 3 statements are even numbers (not Weird).
        // n divided by 2 and what is left equals to 0. Therefore, a even number.
        if (n % 2 == 0) { // using the equality operator not the assignment operator.
            if (n == 2 || n == 4) {
                System.out.println("Not Weird");
            } else if (n > 5 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
            // If the input is not even, then the below will execute as it must be odd - Weird.
        }  else {
            System.out.println("Weird");
        }
    }
}
