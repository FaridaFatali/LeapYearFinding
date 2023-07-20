package org.example;

/**
 * Exercise: https://www.youtube.com/watch?v=qIF9W-A__0I&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=13
 * @author Farida Fatali
 */

// Determine if the year entered by the user is a leap year.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if(((year % 4 == 0) && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + " is Leap Year!");
        } else {
            System.out.println(year + " is not Leap Year!");
        }
    }
}