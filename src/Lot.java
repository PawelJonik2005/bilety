import java.time.LocalDate;

public class Lot {
    int numerlotu;
    LocalDate data;
    String miejsceStartu;
    String miejsceDocelowe;

    public Lot (int numerlotu, LocalDate data, String miejsceStartu, String miejsceDocelowe) {
        this.numerlotu = numerlotu;
        this.data = data;
        this.miejsceStartu = miejsceStartu;
        this.miejsceDocelowe = miejsceDocelowe;
    }

    public int getNumerlotu() {
        return numerlotu;
    }

    public LocalDate getData() {
        return data;
    }

    public String getMiejsceStartu() {
        return miejsceStartu;
    }

    public String getMiejsceDocelowe() {
        return miejsceDocelowe;
    }

    public String toString() {
        return "Lot nr: " + numerlotu + " z " + miejsceStartu + " do " + miejsceDocelowe + " Odbędzie się: " + data;
    }

}
