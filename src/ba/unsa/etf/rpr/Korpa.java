package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli= new Artikl[50];
    int vel = 0;

    public boolean dodajArtikl(Artikl artiklo) {
    if (vel > 50)
        return false;
    artikli[vel] = artiklo;
    vel+=1;
    return true;
    }
    public Artikl[] getArtikli(){
    return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i = 0; i<vel; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl novi=new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                for(int j=i; j<vel-1;j++)
                    artikli[i]=artikli[j+1];
                vel--;
                return novi;
            }

        }
     return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i = 0; i < vel; i++){
            suma+=artikli[i].getCijena();
        }
        return suma;
    }
}
