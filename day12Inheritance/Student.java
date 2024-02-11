package day12Inheritance;

public class Student extends Person{

    private int[] scores;


    Student(String firstName, String lastName, int id, int[] scores){

        super(firstName,lastName,id);
        this.scores = scores;

    }

    public char calculate(){
        char grade;
        int sum = 0;

        for (int s : scores){
            sum = sum + s;
        }

        int avg = sum / scores.length;

        if (avg >= 90 && avg <= 100){
            grade = 'O';
        }
        else if (avg >= 80 && avg < 90){
            grade = 'E';
        }
        else if (avg >= 70 && avg < 80){
            grade = 'A';
        }else if (avg >= 55 && avg < 70){
            grade = 'P';
        }else if (avg >= 40 && avg < 55){
            grade = 'D';
        }
        else{
            grade = 'T';

        }

        return grade;
    }
}
