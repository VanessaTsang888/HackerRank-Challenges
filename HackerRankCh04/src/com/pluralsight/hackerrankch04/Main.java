package com.pluralsight.hackerrankch04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// This task is: Stdin and Stdout ||

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        /* using nextDouble() or nextInt() will only read number characters from the input stream, it will ignore and leave formatting characters such as new line characters
        nextLine() reads input until it hits a new line character, because nextDouble() leaves this character from the previous line nextLine() reads an empty string
        calling nextLine() again will move past and get the next line from the input */

        // Get info as type of string from user.
        scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}