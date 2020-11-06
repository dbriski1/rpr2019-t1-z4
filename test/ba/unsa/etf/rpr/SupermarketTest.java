package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
       boolean tacno=supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
      assertTrue(tacno);
    }
   /* @Test
    void dodajArtikl1() {
        Supermarket supermarket = new Supermarket();
        for(int i=0;i<50;i++){
            supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "i"));
        }
        boolean tacno=supermarket.dodajArtikl(new Artikl("Biciklo", 1003, "55"));
        assertFalse(tacno);
    }*/
    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        Artikl a = supermarket.izbaciArtiklSaKodom("1");
        assertNotEquals(0,a);
    }
}