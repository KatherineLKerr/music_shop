import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("brass", "normal", "gold", 200.00, 250.00, 3);
    }

    @Test
    public void hasMaterial() {
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("normal", trumpet.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("gold", trumpet.getColour());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(200.00, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(250.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, trumpet.calculateMarkup(), 0.01);
    }
}
