public class Bilet {

    Lot lot;
    Pasazer pasazer;

    public Bilet(Lot lot, Pasazer pasazer) {
        this.lot = lot;
        this.pasazer = pasazer;
    }

    public String toString() {
        return pasazer.toString() + " - " + lot.toString();
    }
}
