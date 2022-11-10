public record Lamp(String type, int lightingPower, int numberOfDiodLamps, String manufacturer,
        String color, double price) {

    static final String size = "Standart size";

    public Lamp() {
        this("Not defiend", 0, 0, "Not defiend", "Not defiend", 0.0);
    }

    public Lamp(String type, String manufacturer, double price) {
        this(type, 0, 0, manufacturer, "Not defiend", price);
    }

    public Lamp {
        if (price < 0.0) {
            throw new IllegalArgumentException(
                    "Lamp Price cannot be below 0.0 uah.");
        }
    }

    public static String size() {
        return size;
    }

    @Override
    public String toString() {
        return "Lamp(type: " + this.type + ", lightPower = " + this.lightingPower
                + ", numberOfDiodLamps = " + this.numberOfDiodLamps + ", manufacturer: " + this.manufacturer + ", color: "
                + this.color + ", price = " + this.price + ")";
    }

}