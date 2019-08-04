package items;

import interfaces.ISell;

public class SheetMusic implements ISell {

    private String title;
    private String artist;
    private String genre;
    private double buyingPrice;
    private double sellingPrice;

    public SheetMusic(String title, String artist, String genre, double buyingPrice, double sellingPrice) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }
}
