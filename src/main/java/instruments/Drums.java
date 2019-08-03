package instruments;

public class Drums extends Instrument{

    private int numberOfDrums;

    public Drums(String material, String type, String colour, double buyingPrice, double sellingPrice, int numberOfDrums) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.numberOfDrums = numberOfDrums;
    }

    public String play() {
        return "boom boom";
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
}
