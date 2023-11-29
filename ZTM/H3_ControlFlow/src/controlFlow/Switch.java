package controlFlow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.next();
        switch (name) {
            case "Marlon" -> System.out.println("Wrong");
            case "Patty" -> System.out.println("Correct");
            default -> System.out.println("Nope");
        }
        System.out.println( (int) (Math.random() * 10));
    }
}
