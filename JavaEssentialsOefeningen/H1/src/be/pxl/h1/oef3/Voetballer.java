package be.pxl.h1.oef3;

public class Voetballer {
    String namePlayer;
    int age;
    int avgScore;
    String typePlayer;
    int goalsScored;
    int goalsConceded;

    public void setNamePlayer(String namePlayer){
        this.namePlayer = namePlayer;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAvgScore(int avgScore){
        this.avgScore = avgScore;
    }
    public void setTypePlayer(String typePlayer){
        this.typePlayer = typePlayer;
    }

    public void setGoalsScored(int goalsScored){
        this.goalsScored = goalsScored;
    }
    public void setGoalsConceded(int goalsConceded){
        this.goalsConceded = goalsConceded;
    }

    public int getValue() {
        return calcValue();
    }

    private int calcValue() {
        if (typePlayer.equals("aanvaller")) {
            int baseValue = 30000;
            int ageValue = (int) calcAgeValue(baseValue);
            int goalValue = calcAttackerGoalValue();
            return  ageValue + goalValue;
        } else if (typePlayer.equals("goalkeeper")) {
           int baseValue = 25000;
           int ageValue = (int)(calcAgeValue(baseValue));
           int conceded = calcGoalsConcededGk();
           int avgValue = calcMidDefGkRatingValue();
           return ageValue + conceded + avgValue;
        }
        return 0;
    }

    private double calcAgeValue(int baseValue) {
        if (age > 30) return baseValue - (baseValue * 0.05);
        else if (age >= 25) return baseValue;
        else return (baseValue * 0.10) + baseValue;
    }


    private int calcAttackerGoalValue() {
        if (this.goalsScored <= 5) {
            return this.goalsScored * 10000;
        } else {
            return ((this.goalsScored - 5) * 20000) + (10000*5);
        }
    }

    private int calcMidDefGkRatingValue() {
        return this.avgScore * 10000;
    }

    private int calcGoalsConcededGk() {
        if (this.goalsConceded >= 20) {
            return -9000;
        } else {
            return 0;
        }
    }
}
