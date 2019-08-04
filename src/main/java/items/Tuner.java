package items;

import interfaces.ISell;

public class Tuner implements ISell {

    public String instrumentFor;
    public String type;
    public double sellingPrice;
    public double buyingPrice;

    public Tuner(String instrumentFor, String type, double sellingPrice, double buyingPrice) {
        this.instrumentFor = instrumentFor;
        this.type = type;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
    }

    public String getInstrumentFor() {
        return instrumentFor;
    }

    public String getType() {
        return type;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
