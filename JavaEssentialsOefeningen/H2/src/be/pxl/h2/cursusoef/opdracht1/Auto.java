package be.pxl.h2.cursusoef.opdracht1;

public class Auto {
    public static final int AANTAL_WIELEN = 4;
    private static int teller;
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;


    public Auto(String merk, String kleur, int aantalDeuren){
        this(merk, kleur, aantalDeuren, 0);
    }



    public Auto(String merk, String kleur, int aantalDeuren,
                int kilometerstand){
        this.merk = merk;
        this.kleur = kleur;
        this.aantalDeuren = aantalDeuren;
        this.kilometerstand = Math.abs(kilometerstand);
        teller++;
    }

    public Auto(Auto bestaandeAuto){
        this.merk = bestaandeAuto.merk;
        this.kleur = bestaandeAuto.kleur;
        this.aantalDeuren = bestaandeAuto.aantalDeuren;
        this.kilometerstand = bestaandeAuto.kilometerstand;
    }

    //    GETTERS
    public int getTeller(){
        return teller;
    }
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
    public void rijden(int afstand) {
        this.kilometerstand += afstand;
    }

    public void rijden(int uren, int snelheid) {
        this.kilometerstand += uren * snelheid;
    }

}
