import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("wood", "acoustic", "red", 150.00, 200.00, 6);
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("acoustic", guitar.getType());
    }

    @Test
    public void hasColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(150.00, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(200.00, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasNoOfStrings() {
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canBePlayed() {
        assertEquals("twang twang twang", guitar.play());
    }
}
