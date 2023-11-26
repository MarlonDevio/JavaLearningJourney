package be.pxl.h1.oef7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sword[] swords = new Sword[6];
        for (int i = 0; i < swords.length; i++){
            swords[i] = new Sword();
            swords[i].setMaterial("papier");
            System.out.println(swords[i].getMaterial());
        }

    }

}
