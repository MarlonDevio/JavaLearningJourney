package be.pxl.h2.cursusoef.opdracht3;

public class Klasgroep {
    public static final int MAX_STUDENTS = 40;
    String naam;
    int aantalStudenten;

    public Klasgroep(){
        this("1TINx", 0);
    }

   public Klasgroep(String naam, int aantalStudenten){
       this.naam = naam;
       if (aantalStudenten <= this.MAX_STUDENTS) {
           this.aantalStudenten = aantalStudenten;
       } else{
           System.out.println("Te veel studenten!");
       }
   }

}
