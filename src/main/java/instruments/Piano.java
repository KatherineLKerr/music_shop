package instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(String material, String type, String colour, double buyingPrice, double sellingPrice, int noOfKeys) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
