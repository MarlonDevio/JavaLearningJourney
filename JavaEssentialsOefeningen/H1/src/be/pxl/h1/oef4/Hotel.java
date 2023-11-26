package be.pxl.h1.oef4;

public class Hotel {
    private String hotelCode;
    private int star;
    private char kidCode;

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getStar() {
        return "*".repeat(star);
    }

    public void setStar(int star) {
        this.star = star;
    }

    public char getKidCode() {
        return kidCode;
    }

    public int calcPriceKid(){
        if (kidCode == 'A' && (star == 1 || star == 2)){
            return 0;
        }else return getPrice() / 2;
    }

    public void setKidCode(char kidCode) {
        this.kidCode = kidCode;
    }

    public int getPrice() {
        if (hotelCode.equals("HI")) {
            return 70;
        } else if (star >= 4) {
            return 60;
        } else if (star == 3) {
            if (hotelCode.equals("BR") || hotelCode.equals("AN")) return 60;
            else return 56;
        }
        else return 48;
    }
}
