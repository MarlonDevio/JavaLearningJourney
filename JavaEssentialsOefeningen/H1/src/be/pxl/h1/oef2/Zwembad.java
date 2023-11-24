package be.pxl.h1.oef2;

public class Zwembad {
    private double length;
    private double width;
    private double depth;

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getDepth(){
        return this.depth;
    }

    public int getVolume(){
        return (int) ((this.length * this.width * this.depth) * 1000);
    }

    public int getVolumeWater(){
        int totaalVolume = getVolume();
        return (int)(totaalVolume * 0.98);
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setDepth(double depth){
        this.depth = depth;
    }
}
