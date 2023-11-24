package be.pxl.h1.oef1;

public class MijnToren {
    public static void main(String[] args) {
        Toren toren1 = new Toren();
        toren1.setName("Zuidertoren");
        toren1.setLocation("St Gillis Brussel");
        toren1.setBuildYear(1967);
        toren1.setHeight(150);
        toren1.setFloors(37);
        System.out.println(toren1.getName());
        System.out.println(toren1.getLocation());
        System.out.println(toren1.getBuildYear());
        System.out.println(toren1.getHeight());
        System.out.println(toren1.getFloors());

    }
}
