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
        produkty.add(produkt);
    }

    //metoda liczenia ceny produktów
    public double policzWartosc()
    {
        double suma = 0;
        for(ProduktMenu p : produkty)
        {
            suma += p.getCena();
        }
        return suma;
    }

    //metoda oznaczania jako opłacone
    public void oznaczJakoOplacone()
    {
        this.oplacone = true;
    }

    //metoda pobieranie następnego numeru
    public static int pobierzKolejnyNumer()
    {
        return kolejnyNumer;
    }

    //liczenie liczby produktów (jest w main)
    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    @Override
    public String toString()
    {
        return  "Zamówienie nr: " + numerZamowienia +
                "\nKlient: " + klient.getDane() +
                "\nProdukty:\n" + produkty +
                "\nStatus" + (oplacone ? "Opłacone" : "Nieopłacone");
    }
}