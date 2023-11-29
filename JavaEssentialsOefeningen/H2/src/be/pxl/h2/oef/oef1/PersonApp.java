package be.pxl.h2.oef.oef1;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Marlon", "Hamaekers");
        person.setWeight(88.4);
        person.setLength(1.81);
        String formattedString = person.toString();
        System.out.println(formattedString);
        person.addSurNames("Bjorn Carine");
        System.out.println(person.getVoornaam());
        double bmi = person.calcBmi();
        System.out.println(person.giveDescription());
        System.out.println(person.getVoornaam() + " : " + bmi);

    }
}
