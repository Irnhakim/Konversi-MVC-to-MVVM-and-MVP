package ac.id.unikom.challenge;

public class Meter {
    private double meter;

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public String toKilometer() {
        double kilometer = meter / 1000;
        return String.valueOf(kilometer);
    }

    public String toCentimeter() {
        double centimeter = meter * 100;
        return String.valueOf(centimeter);
    }
}
