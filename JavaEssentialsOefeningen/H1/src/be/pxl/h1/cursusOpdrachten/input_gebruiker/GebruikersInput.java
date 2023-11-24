package be.pxl.h1.cursusOpdrachten.input_gebruiker;
import java.util.Scanner;

public class GebruikersInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wat is je naam? ");
        String naam =  input.next();
        System.out.println("Hallo " + naam);
        input.close();
    }

}
