package day12Inheritance;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = scan.next();
            System.out.println("Enter Last Name");
            String lastName = scan.next();
            System.out.println("Student Number");
            int id = scan.nextInt();
            System.out.println("Number of scores");

            int numScores = scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                String result = "Score " + (i+1);
                System.out.println(result);
                testScores[i] = scan.nextInt();

                if (testScores[i] < 0 || testScores[i] > 100) {
                    System.out.println("Invalid score! Please enter a score between 0 and 100.");
                    // Adjust i to re-prompt for the same index
                    i--;
                }
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
          //  s.printPerson();
            System.out.println("Name: "+firstName+ " " + lastName);
            System.out.println("ID: "+id);
            System.out.println("Grade: " + s.calculate() );
        }

}
