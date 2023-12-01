package oefeningen;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grade: ");
        String grade = scanner.nextLine();
        switch (grade.toLowerCase()){
            case "a" -> System.out.println("Great job!");
            case "b" -> System.out.println("Getting there!");
            case "c" -> System.out.println("Work harder.");
            case "d" -> System.out.println("Not good! ");
        }


    }
}
