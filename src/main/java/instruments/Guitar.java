package instruments;

public class Guitar extends Instrument{

    private int noOfStrings;

    public Guitar(String material, String type, String colour, double buyingPrice, double sellingPrice, int noOfStrings) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

}
