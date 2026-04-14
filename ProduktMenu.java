import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria){
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod()
    {
        return kod;
    }

    public double getCena()
    {
        return cena;
    }

    public static int getLiczbaProduktow()
    {
        return liczbaProduktow;
    }

    //nadpisywanie produktów i ich wartości
    @Override
    public String toString()
    {
        return "Produkt: " + nazwa + ", Kod: " + kod + ", Cena: " +
                cena + "zł, Kategoria: " + kategoria;
    }

    //nadpisywanie object equals
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProduktMenu other = (ProduktMenu) obj;
        return Objects.equals(kod, other.kod);
    }
}