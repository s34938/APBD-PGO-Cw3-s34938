import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient)
    {
        this.klient = klient;
        this.numerZamowienia=kolejnyNumer++;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    //metoda dodawania produktu
    public void dodajProdukt(ProduktMenu produkt)
    {
        produkt.add(produkt);
    }
}