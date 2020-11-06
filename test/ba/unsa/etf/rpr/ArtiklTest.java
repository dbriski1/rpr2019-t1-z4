package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
@Test
    void testKonstruktora(){
    Artikl novi=new Artikl("biciklo",300,"1");
    assertEquals("biciklo",novi.getNaziv());
    assertEquals(300,novi.getCijena());
    assertEquals("1",novi.getKod());
}
}