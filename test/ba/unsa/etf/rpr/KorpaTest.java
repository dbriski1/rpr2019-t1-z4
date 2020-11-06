package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        Artikl a = supermarket.izbaciArtiklSaKodom("2");
        assertTrue(korpa.dodajArtikl(a));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        Artikl a = supermarket.izbaciArtiklSaKodom("2");
        korpa.dodajArtikl(a);
        Artikl b = korpa.izbaciArtiklSaKodom("2");
        assertNotEquals(0,b);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        Artikl a = supermarket.izbaciArtiklSaKodom("2");
        korpa.dodajArtikl(a);
        a=supermarket.izbaciArtiklSaKodom("1");
        korpa.dodajArtikl(a);
        a=supermarket.izbaciArtiklSaKodom("3");
        korpa.dodajArtikl(a);
        assertEquals(3000,korpa.dajUkupnuCijenuArtikala());
    }
}