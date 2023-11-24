package be.pxl.h1.cursusOpdrachten.opdracht5;

public class StripboekApp {
    public static void main(String[] args) {
        Stripboek stripboek = new Stripboek();
        stripboek.setReeks("Kuifje");
        stripboek.setTitel("De grote boze wolf");
        stripboek.setAlbum(34);
        stripboek.setAuteur("Marlon");

        System.out.println(stripboek.getReeks() + " " + stripboek.getTitel() + " " + stripboek.getAlbum() + " " + stripboek.getAuteur());
    }

}
