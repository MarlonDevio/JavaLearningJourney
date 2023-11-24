package be.pxl.h1.cursusOpdrachten.oef2;

//Voor iedere auto is de basisprijs € 20000.
//Voor 3-deurs is er een korting van € 1000.

public class Auto {
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;


    //    GETTERS
    public String getKleur() {
        return kleur;  // String is returntype
    }

    public String getMerk() {
        return merk;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public int getPrijs() {
        int prijs = 20000;
        if (aantalDeuren == 3) {
            prijs -= 1000;
        }
        return prijs;
    }

//    SETTERS

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

//    Methods
    public void rijden(int afstand){
        this.kilometerstand += afstand;
    }
    public void rijden(int uren, int snelheid){
        this.kilometerstand += uren * snelheid;
    }

}
