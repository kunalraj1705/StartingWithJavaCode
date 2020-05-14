package Inheritance;

/**
 * *  @author Kunal Raj Bhardwaj
 */

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    public Student(String firstname, String lastname, int id, int[] testScores){
        super(firstname, lastname, id);
        this.testScores = testScores;
    }

    public char calculate(){
        int sum = 0;
        char c = '\0';

        for(int num : testScores){
            sum = sum + num;
        }
        int avg = sum/testScores.length;
        System.out.println("Average : "+avg);

        if(avg >= 90 && avg<= 100){
            c = 'O';
        }else if(avg < 90 && avg >= 80){
            c = 'E';
        }else if(avg < 80 && avg >= 70){
            c = 'A';
        }else if(avg < 70 && avg >= 55){
            c = 'P';
        }else if(avg < 55 && avg >= 40){
            c = 'D';
        }else if(avg < 40){
            c = 'T';
        }
        return c;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Name : ");
        String firstName = scan.next();

        System.out.println("Enter the Last Name");
        String lastName = scan.next();

        System.out.println("Enter the id : ");
        int id = scan.nextInt();

        System.out.println("Enter the number of scores : ");
        int numScores = scan.nextInt();

        System.out.println("Enter the scores :");
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}