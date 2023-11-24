package be.pxl.h1.oef3;

public class Voetballer {
    String namePlayer;
    int age;
    int avgScore;
    String typePlayer;
    int goalsScored;
    int goalsConceded;

    public int getValue() {

    }

    private int calcBaseValue() {
        return switch (typePlayer) {
            case "aanvaller" -> 30000;
            case "middenvelder" -> 28000;
            case "verdediger" -> 29000;
            case "doelman" -> 25000;
            default -> 0;
        };
    }

    private double calcAgeValue(int baseValue) {
        if (age > 30) {
            return baseValue - (baseValue * 0.05);
        } else if (age >= 25) {
            return baseValue;
        } else {
           return (baseValue * 0.10) + baseValue;
        }
    }
}
