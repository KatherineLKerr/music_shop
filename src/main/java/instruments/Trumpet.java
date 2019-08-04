package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class Trumpet extends Instrument implements ISell, IPlay {

    private int noOfValves;

    public Trumpet(String material, String type, String colour, double buyingPrice, double sellingPrice, int noOfValves) {
        super(material, type, colour, buyingPrice, sellingPrice);
        this.noOfValves = noOfValves;
    }

    public String play () {
        return "toot toot";
    }

    public int getNoOfKeys() {
        return noOfValves;
    }

}
