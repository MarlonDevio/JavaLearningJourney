package be.pxl.h1.oef5;

import org.w3c.dom.ls.LSOutput;

public class SpaceShip {

    private String name;
    private int hits;
    private boolean shieldOn;


    // Name get/set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    shield get/set
    public boolean isShieldOn() {
        return this.shieldOn;
    }

    public void setShieldOn(boolean shieldOn) {
        this.shieldOn = shieldOn;
        System.out.println(this.name + " puts shield " + (this.shieldOn
                ? "on" : "off"));
    }


    // fire get/set
    public void fire(SpaceShip other){
        System.out.println(this.name + " vuurt op " + other.name);
        if (!other.shieldOn){
           other.hits++;
           if (other.isDestroyed()){
               System.out.println(this.name + " destroyed " + other.name);
           }
        } else {
            this.hits++;
            if (this.isDestroyed()) {
                System.out.println(this.name + " is destroyed by " + other.name);
            }
        }

    }

    public boolean isDestroyed(){
        return hits >= 5;
    }
}
