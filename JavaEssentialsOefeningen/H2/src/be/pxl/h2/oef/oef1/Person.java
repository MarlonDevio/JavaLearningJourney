package be.pxl.h2.oef.oef1;

public class Person {
    private String voornaam;
    private String naam;
    private int age;
    private double weight;
    private double length;
    private int birthYear;


    public Person(){this("onbekend", "onbekend");};

    public Person(String voornaam, String naam){
        this.voornaam = voornaam;
        this.naam = naam;
    }

    public Person(Person otherPerson){
        this.naam = otherPerson.naam;
        this.voornaam = otherPerson.voornaam;
        this.age = otherPerson.age;
        this.weight = otherPerson.weight;
        this.birthYear = otherPerson.birthYear;
        this.length = otherPerson.length;
    }


// NAMES
    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void addSurNames(String voornamen){
        this.voornaam = this.voornaam + " " + voornamen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Age
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    public String giveDescription(){
        return """
               - BMI lager dan 18 -> ondergewicht
               - BMI vanaf 18 tot 25 -> normaal
               - BMI vanaf 25 tot 30 -> overgewicht
               - BMI vanaf 30 tot 40 -> obesitas
               - BMI vanaf 40 -> morbide obesitas
               """;
    }

    public double calcBmi(){
        return this.weight / (this.length * this.length);
    }
    @Override
    public String toString(){
        return String.format("""
                Deze persoon is %s %s
                gewicht         : %.2f
                lengte          : %.2f
                geboortejaar    : %d
                """,this.voornaam, this.naam, this.getWeight(),
                this.getLength(), this.getBirthYear());
    }

}
