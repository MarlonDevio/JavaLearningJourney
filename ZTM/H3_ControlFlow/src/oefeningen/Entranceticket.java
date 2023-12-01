package oefeningen;

import java.util.Scanner;

public class Entranceticket {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age? ");
        int age = scanner.nextInt();
        int ticketPrice = calcPrice(age);
        System.out.println(ticketPrice);
    }

    public static int calcPrice(int age) {
        if (age < 5) {
            return 0;
        } else if (age <= 12) {
            return 5;
        } else if (age <= 18) {
            return 10;
        } else {
            return 15;
        }
    }
}
