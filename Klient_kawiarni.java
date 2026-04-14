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
}