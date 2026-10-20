package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        // Create a scanner object so we can read input
        Scanner theScanner = new
                Scanner(System.in);
        // ask the user to enter their name
        System.out.println("Please enter your name");
        // read the first name and remove any extra spaces
        System.out.print("Frist name: ");
        String firstName = theScanner.nextLine().trim();

        // read the middle and remove any extra spaces

    }
}
