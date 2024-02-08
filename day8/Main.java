package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
        * You will then be given an unknown number of names to query your phone book for.
        * For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
        * if an entry for  is not found, print Not found instead.
        Note: Your phone book should be a Dictionary/Map/HashMap data structure.*/

        Map<String, Integer> phoneBook = new HashMap<>();

        System.out.println("Number of entries:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++){
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone number:");
            int phoneNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            phoneBook.put(name,phoneNumber);
        }

        System.out.println("Search contact");
        String s = scanner.nextLine();
        if (phoneBook.containsKey(s)){
            System.out.println(s + "=" + phoneBook.get(s));
        }
        else{
            System.out.println("Not found!");
        }

        scanner.close();


    }
}
