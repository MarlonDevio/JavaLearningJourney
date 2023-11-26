package be.pxl.h1.oef3;

public class VoetbalPloeg {
    public static void main(String[] args) {
        Voetballer ronaldo = new Voetballer();
        Voetballer courtois = new Voetballer();

        courtois.setNamePlayer("Courtois");
        courtois.setAge(29);
        courtois.setTypePlayer("goalkeeper");
        courtois.setGoalsConceded(22);
        courtois.setAvgScore(8);
        System.out.println(courtois.getValue());

        ronaldo.setNamePlayer("messi");
        ronaldo.setAge(34);
        ronaldo.setTypePlayer("aanvaller");
        ronaldo.setAvgScore(10);
        ronaldo.setGoalsScored(15);
        System.out.println(ronaldo.getValue());

    }
}
