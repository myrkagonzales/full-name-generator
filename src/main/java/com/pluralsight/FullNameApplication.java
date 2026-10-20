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

        // printing full name
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println(suffix);

        // Begin building the full name
        String fullName = firstName;

        // only add the middle name if the user entered one
        if (!middleName.isEmpty()) {
            fullName += " " + middleName;
        }

        // add last name
        fullName += " " + lastName;

        // add the suffix if one was entered
        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        // display the completed full name
        System.out.println("Full name: " + fullName);

        // close scanner
        theScanner.close();


    }
}
