public class Pasazer {

    String imie;
    String nazwisko;
    int numerTelefonu;

    public Pasazer (String imie, String nazwisko, int numerrTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerrTelefonu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public String toString() {
        return imie + " " + nazwisko + " (" + numerTelefonu +")";
    }
}
