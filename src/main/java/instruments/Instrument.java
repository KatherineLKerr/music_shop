package instruments;

public abstract class Instrument {

    protected String material;
    protected String type;
    protected String colour;
    protected double buyingPrice;
    protected double sellingPrice;

    public Instrument(String material, String type, String colour, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

}
