import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void setUp() {
        sheetMusic = new SheetMusic("whatever", "i dont know", "anything", 2.00, 5.00);
    }

    @Test
    public void hasTitle() {
        assertEquals("whatever", sheetMusic.getTitle());
    }

    @Test
    public void hasArtist() {
        assertEquals("i dont know", sheetMusic.getArtist());
    }

    @Test
    public void hasGenre() {
        assertEquals("anything", sheetMusic.getGenre());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(2.00, sheetMusic.getBuyingPrice(),0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(5.00, sheetMusic.getSellingPrice(),0.01);
    }

}
