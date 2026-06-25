// Program to demonstrate Classes and Objects in Java
// Stores and displays details of multiple students

import java.util.Scanner;

// Student class — blueprint for a student
class Student
{
    // Instance variables — details of each student
    String usn;          // University Serial Number
    String name;         // Student name
    String branch;       // Branch of study
    String phone;        // Phone number
    double percentage;   // Academic percentage

    // Method to read student details from user
    void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the USN: ");
        usn = sc.nextLine();

        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter branch: ");
        branch = sc.nextLine();

        System.out.println("Enter the phone number: ");
        phone = sc.nextLine();

        System.out.println("Enter percentage: ");
        percentage = sc.nextDouble();

        sc.nextLine(); // clears buffer after nextDouble()
    }

    // Method to display student details in table format
    void display()
    {
        System.out.println(usn + "\t  " + name + "\t   " + 
                          branch + "\t   " + phone + "\t  " + percentage);
    }
}

// Main class — entry point of the program
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Read number of students
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clears buffer after nextInt()

        // Create array of Student objects
        Student[] student = new Student[n];

        // Read details for each student
        for(int i = 0; i < n; i++)
        {
            student[i] = new Student(); // create new Student object
            System.out.println("Enter the details of student " + (i+1));
            System.out.println("---------------------------------------------");
            student[i].read(); // call read method
        }

        // Display table header
        System.out.println("\nUSN\t\tNAME\t\tBRANCH\t\tPHONE\t\tPERCENTAGE");
        System.out.println("-------------------------------------------------------------------");

        // Display details of each student
        for(int i = 0; i < n; i++)
        {
            student[i].display();
        }
    }
}