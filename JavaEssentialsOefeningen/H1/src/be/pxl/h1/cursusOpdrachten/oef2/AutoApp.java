package be.pxl.h1.cursusOpdrachten.oef2;

public class AutoApp {

    public static void main(String[] args) {
        Auto auto = new Auto();
        Auto auto2 = new Auto();
        auto2.setKilometerstand(150);
        auto2.rijden(1,60);
        System.out.println(auto2.getKilometerstand());
        auto.setMerk("Mercedes gt64");
        auto.setAantalDeuren(3);
        auto.setKleur("Zwart");
        auto.setKilometerstand(0);
        auto.rijden(2,60);
        auto.rijden(320);
        System.out.println("Mijn favoriete auto is " + auto.getMerk() + " De " +
                "kleur is " + auto.getKleur() + " en heeft " + auto.getAantalDeuren()  +
                " deuren. Liefst een volledig nieuwe wagen waarbij het aantal" +
                " KM's " + auto.getKilometerstand() + " is.");
        System.out.println("De prijs voor deze wagen bedraagt: " + auto.getPrijs());
    }

}
