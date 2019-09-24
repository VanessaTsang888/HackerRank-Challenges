package com.pluralsight.hackerrankch03;

import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (n % 2 != 0) {
            System.out.println("Weird");
            // The below two if statements are nested.
            if (n == 2 || n == 4) { // equality operator not the assignment operator.
                System.out.println("Not Weird");
            }
            if (n > 5 && n <= 20) {
                System.out.println("Weird");
            }
        }
        else if (n > 20) {
            System.out.println("Not Weird");
        }

        else {
            // odd numbers = Weird.
            System.out.println("Weird");
        }
    }
}