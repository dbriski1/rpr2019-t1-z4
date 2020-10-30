package ba.unsa.etf.rpr;

public class Artikl {
  String kod;
  int cijena;
  String naziv;

public Artikl(String ime, int cij, String cod){
    naziv=ime;
    cijena=cij;
    kod=cod;
}
public int getCijena(){
    return this.cijena;
}
public String getKod(){
    return kod;
}
public String getNaziv(){
    return naziv;
}
}
