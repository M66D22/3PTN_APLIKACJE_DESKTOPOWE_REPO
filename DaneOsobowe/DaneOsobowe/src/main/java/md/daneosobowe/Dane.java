package md.daneosobowe;

public class Dane {
    private String imie;
    private String nazwisko;
    private String klasa;
    private String rokRozpoczeciaNauki;

    public Dane() {
    } 
    
    public Dane(String imie, String nazwisko, String klasa, String rokRozpoczeciaNauki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.rokRozpoczeciaNauki = rokRozpoczeciaNauki;
    }

    @Override
    public String toString() {
        return imie+", "+nazwisko+", "+klasa+", "+rokRozpoczeciaNauki;
    }
}
