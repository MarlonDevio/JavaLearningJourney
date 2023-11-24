package be.pxl.h1.cursusOpdrachten.opdracht7;

public class Planet {
    private String name;
    private int diameter;
    private long distanceFromSun;
    private double distanceFromSunInAE;

    //    Aarde 1 AE van zon
//    Mars? Neptunus? AE
    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getDistanceFromSunInAE(){
        return distanceFromSunInAE;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public void setDistanceFromSun(long distanceFromSun){
        this.distanceFromSun = distanceFromSun;
        updateDistanceFromSunInAE();
    }

   private void updateDistanceFromSunInAE(){
       double ae = 149600000;
       this.distanceFromSunInAE = (double) this.distanceFromSun / ae;

   }




}
//public class VariableDeclaration {
//    public static class Demo1 {
//        public static void main(String[] args){
//           int number;
//           number = 5;
//           int sum = number + 2;
//           double salary = 1234.9;
//           long bigNumber = 123456789123456789L;
//           number = (int) salary;
//            System.out.println(number);
//            number = (int) bigNumber;
//            System.out.println(number);
//            char letter = 'a';
//            boolean geslaagd = true;
//            String text = "Goedenacht!";
//        }
//    }
//}
