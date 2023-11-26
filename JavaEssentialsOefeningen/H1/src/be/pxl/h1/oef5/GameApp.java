package be.pxl.h1.oef5;

public class GameApp {
    public static void main(String[] args) {
        SpaceShip galactica = new SpaceShip();
        SpaceShip kubernetes = new SpaceShip();
        kubernetes.setName("Kubernetes");
        galactica.setName("Galactica");
        kubernetes.fire(galactica);

        kubernetes.fire(galactica);
        kubernetes.fire(galactica);
        galactica.setShieldOn(true);
        kubernetes.fire(galactica);
        kubernetes.fire(galactica);
        kubernetes.fire(galactica);
        kubernetes.fire(galactica);
        kubernetes.fire(galactica);
        kubernetes.fire(galactica);

    }
}
