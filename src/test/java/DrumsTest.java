import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void setUp() {
        drums = new Drums("metal", "kit", "blue", 400, 500, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("metal", drums.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("kit", drums.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", drums.getColour());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(400.00, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500.00, drums.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, drums.getNumberOfDrums());
    }

    @Test
    public void canBePlayed() {
        assertEquals("boom boom", drums.play());
    }
}
