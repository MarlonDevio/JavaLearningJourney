package be.pxl.h2.cursusoef.opdracht1;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Mercedes", "Zwart", 5);
        Auto auto2 = new Auto("Mercedes", "Zwart", 4);
        System.out.println(auto1.getKleur());
        System.out.println(auto1.AANTAL_WIELEN);


        Auto auto3 = new Auto("Mercedes", "Zwart", 5, -120);
        System.out.println(auto3.getKilometerstand());
        System.out.println(auto3.getTeller());
        System.out.println(auto1.getTeller());
    }

}
