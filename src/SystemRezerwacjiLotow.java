import java.util.ArrayList;
import java.util.List;

public class SystemRezerwacjiLotow {

    List<Lot> listaLotow;
    List<Pasazer> listaPasazerow;
    List<Bilet> listaBiletow;

    public SystemRezerwacjiLotow() {
        listaLotow = new ArrayList<>();
        listaPasazerow = new ArrayList<>();
        listaBiletow = new ArrayList<>();
    }

    public void dodajLot(Lot lot) {
        listaLotow.add(lot);
    }

    public void dodajPasazera(Pasazer pasazer) {
        listaPasazerow.add(pasazer);
    }

    public void zarezerwujBilet( Lot lot, Pasazer pasazer) {
        if (listaLotow.contains(lot) && listaPasazerow.contains(pasazer)) {
            Bilet bilet = new Bilet(lot, pasazer);
            listaBiletow.add(bilet);
            System.out.println("Bilet został zarezerwowany dla " + pasazer.getImie() + " " + pasazer.getNazwisko() + " na lot nr " + lot.getNumerlotu() + " z " + lot.getMiejsceStartu() + " do " + lot.getMiejsceDocelowe());
        } else {
            System.out.println("Nie można zarezerwować biletu. Sprawdź dostępność lotu i dane pasażera.");
        }
    }
    public void wyswietlDostepneLoty() {
        System.out.println("Dostępne loty: ");
        for (Lot lot : listaLotow) {
            System.out.println(lot);
        }
    }

    public void wyswietlZarezerwowaneBilety() {
        System.out.println("Zarezerwowane bilety: ");
        for (Bilet bilet : listaBiletow) {
            System.out.println(bilet);
        }
    }


}
