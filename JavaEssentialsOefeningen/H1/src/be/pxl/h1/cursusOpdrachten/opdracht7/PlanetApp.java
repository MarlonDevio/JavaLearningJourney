package be.pxl.h1.cursusOpdrachten.opdracht7;

public class PlanetApp {
    public static void main(String[] args) {
        Planet mars = new Planet();
        Planet neptunus = new Planet();
        mars.setName("Mars");
        neptunus.setName("Neptunus");
        mars.setDistanceFromSun(227900000);
        neptunus.setDistanceFromSun(4495100000L);

        System.out.println(mars.getDistanceFromSun());
        System.out.println(neptunus.getDistanceFromSun());
        System.out.println(mars.getDistanceFromSunInAE());
        System.out.println(neptunus.getDistanceFromSunInAE());

        int number = 20;
        double dNumber = 2.8;
        System.out.println(number/dNumber);
    }
}
