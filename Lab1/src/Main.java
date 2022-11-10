public class Main {
    public static void main(String[] args) {

        Lamp defaultLamp = new Lamp();
        System.out.println(defaultLamp);

        Lamp officeLamp = new Lamp("Halogen", 100, 200, "Arteriors", "grey", 2000);
        System.out.println(officeLamp.toString());

        Lamp homeLamp = new Lamp("LED", "IKEA", 1000);
        System.out.println(homeLamp.toString());

    }
}