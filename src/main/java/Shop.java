import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList getStock() {
        return stock;
    }
    
    public void addItem(ISell item) {
        stock.add(item);
    }
    
    public void removeItem(ISell item) {
        for (int i = 0; i < stock.size(); i++) {
            ISell stockItem = stock.get(i);
            if (stockItem == item) {
                stock.remove(i);
                return;
            }
        }
    }
}
