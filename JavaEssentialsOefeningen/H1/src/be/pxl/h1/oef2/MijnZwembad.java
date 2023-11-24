package be.pxl.h1.oef2;
import java.util.Scanner;

public class MijnZwembad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zwembad zwembad = new Zwembad();
//        zwembad.setDepth(5);
//        zwembad.setLength(10);
//        zwembad.setWidth(2);
//        System.out.println(zwembad.getVolume());
        System.out.println("Length: ");
        double l = sc.nextDouble();
        System.out.println("Width: ");
        double w = sc.nextDouble();
        System.out.println("Depth: ");
        double d = sc.nextDouble();
        zwembad.setLength(l);
        zwembad.setWidth(w);
        zwembad.setDepth(d);
        System.out.println(zwembad.getVolume());
        System.out.println(zwembad.getVolumeWater());
    }
}
