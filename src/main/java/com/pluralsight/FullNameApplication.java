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

        // Ask for the middle name
        System.out.print("Middle name: ");
        String middleName = theScanner.nextLine().trim();

        // ask for the last name
        System.out.print("Last name: ");
        String lastName = theScanner.nextLine().trim();

        // ask for suffix
        System.out.print("Suffix: ");
        String suffix = theScanner.nextLine().trim();





    }
}
