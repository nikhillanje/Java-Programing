/*
Name: Nikhil Lanje
Class:SY-1
Roll No:113
Subject: OOPs in Java
*/

import java.util.Scanner;

public class SentinelLoop 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int total_grades = 0;
        int grade_count = 0;
        int grade;

        System.out.println("Enter the Grades For a Student (enter -1 to finish):");

        while (true) 
        {
            grade = sc.nextInt();
            if (grade == -1) {
                break;
            }
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                continue; // Skip to the next iteration of the loop
            }
            total_grades += grade; 
            grade_count++; 
        }

        if (grade_count > 0) 
        {
            double average = (double) total_grades / grade_count; 
            System.out.printf("The Total of all Grades: %d%n", total_grades);
            System.out.printf("The Average grade is: %.2f%n", average); 
        } 
        else 
        {
            System.out.println("No grades were entered.");
        }

        sc.close(); 
    }
}

//output//
/*
Enter the Grades For a Student (enter -1 to finish):
5
10
-1
The Total of all Grades: 15
The Average grade is: 7.50

=== Code Execution Successful ===
*/