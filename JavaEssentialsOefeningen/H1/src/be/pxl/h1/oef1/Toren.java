package be.pxl.h1.oef1;

public class Toren {
    private String name;
    private String location;
    private int buildYear;
    private int height;
    private int floors;

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int getHeight() {
        return height;
    }

    public int getFloors() {
        return floors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

}
