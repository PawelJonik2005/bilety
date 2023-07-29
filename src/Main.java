import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lot lot1 = new Lot(1001, LocalDate.of(2023, 7, 20), "Warszawa", "Kraków");
        Lot lot2 = new Lot(1002, LocalDate.of(2023, 7, 26), "Londyn", "Rzeszów");
        Lot lot3 = new Lot(1003, LocalDate.of(2023, 4, 8), "Gdańsk", "Warszawa");

        Pasazer pasazer1 = new Pasazer("Adam", "Kowalski", 578987123);
        Pasazer pasazer2 = new Pasazer("Jan", "Nowak", 678054138);
        Pasazer pasazer3 = new Pasazer("Paweł", "Jonik", 533131605);

        SystemRezerwacjiLotow systemRezerwacji = new SystemRezerwacjiLotow();

        systemRezerwacji.dodajLot(lot1);
        systemRezerwacji.dodajLot(lot2);
        systemRezerwacji.dodajLot(lot3);

        systemRezerwacji.dodajPasazera(pasazer1);
        systemRezerwacji.dodajPasazera(pasazer2);
        systemRezerwacji.dodajPasazera(pasazer3);

        systemRezerwacji.wyswietlDostepneLoty();

        systemRezerwacji.zarezerwujBilet(lot1, pasazer1);
        systemRezerwacji.zarezerwujBilet(lot2, pasazer2);
        systemRezerwacji.zarezerwujBilet(lot3, pasazer3);

        systemRezerwacji.wyswietlZarezerwowaneBilety();





    }
}