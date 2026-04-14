import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email)
    {
       this.idKlienta = idKlienta;
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.email = email;
    }

    //metoda zwracająca dane klienta
    public String getDane()
    {
        return imie + " " + nazwisko + " , " + email;
    }

    //override danych klientów
    @Override
    public String toString()
    {
        return "ID klienta: " + idKlienta + " | " + getDane();
    }

    //Override equals porównujące po ID klienta  albo emailu
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        KlientKawiarni other = (KlientKawiarni) obj;
        return idKlienta == other.idKlienta || Objects.equals(email, other.email);
    }
}