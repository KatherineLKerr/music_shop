import items.ReplacementPart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplacementPartTest {

    private ReplacementPart replacementPart;

    @Before
    public void setUp() {
        replacementPart = new ReplacementPart("Guitar", "replacement strings - electric", 12.00, 7.00);
    }

    @Test
    public void hasInstrumentFor() {
        assertEquals("Guitar", replacementPart.getInstrumentFor());
    }

    @Test
    public void hasType() {
        assertEquals("replacement strings - electric", replacementPart.getType());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(12.00, replacementPart.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(7.00, replacementPart.getBuyingPrice(), 0.01);
    }

}
