import instruments.Guitar;
import interfaces.ISell;
import items.ReplacementPart;
import items.Tuner;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Tuner tuner;
    private ReplacementPart replacementPart;

    @Before
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar("wood", "acoustic", "wood", 300.00, 400.00, 6);
        tuner = new Tuner("guitar", "electric", 12.00, 5.00);
        replacementPart = new ReplacementPart("guitar", "strings", 20.00, 10.00);
    }

    @Test
    public void canAddItem() {
        shop.addItem(tuner);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        shop.addItem(tuner);
        shop.addItem(guitar);
        shop.addItem(replacementPart);
        shop.removeItem(guitar);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void onlyRemovesOneItemIfDuplicates() {
        shop.addItem(tuner);
        shop.addItem(guitar);
        shop.addItem(tuner);
        shop.removeItem(tuner);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void cannotRemoveIfNotInStock() {
        shop.addItem(tuner);
        shop.addItem(replacementPart);
        shop.removeItem(guitar);
        assertEquals(2, shop.getStock().size());
    }
}
