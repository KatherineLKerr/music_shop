import items.Tuner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TunerTest {

    private Tuner tuner;

    @Before
    public void setUp() {
        tuner = new Tuner("Guitar", "electronic", 12.00, 7.00);
    }

    @Test
    public void hasInstrumentFor() {
        assertEquals("Guitar", tuner.getInstrumentFor());
    }

    @Test
    public void hasType() {
        assertEquals("electronic", tuner.getType());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(12.00, tuner.getSellingPrice(), 0.01);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(7.00, tuner.getBuyingPrice(), 0.01);
    }

}
