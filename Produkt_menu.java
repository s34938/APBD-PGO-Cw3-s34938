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
        liczbaProduktow;
    }

    public String getKod()
    {
        return kod;
    }

    public double getCena()
    {
        return Cena;
    }

    public static int getLiczbaProduktow()
    {
        return liczbaProduktow;
    }
}