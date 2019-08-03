import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("wood", "grand", "black", 1200.00, 1800.00, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("grand", piano.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1200.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1800.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNoOfKeys() {
        assertEquals(88, piano.getNoOfKeys());
    }

    @Test
    public void canBePlayed() {
        assertEquals("plinkplonk", piano.play());
    }
}
