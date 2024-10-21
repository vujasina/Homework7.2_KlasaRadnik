import java.math.BigInteger;
import java.util.Scanner;

public class Radnik {

    //polja

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String ziroRacun;
    protected double plata;

    //konstruktori

    protected Radnik() {

    }

    protected Radnik(String ime, String prezime, String jmbg, String ziroRacun, double plata) {

        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
        this.plata = plata;

    }

    //metode

    protected double isplatiPlatu(Double jedinicnaCenaRada, Double brojJedinicaRada) {

        double zaIsplatu = brojJedinicaRada * jedinicnaCenaRada;
        return zaIsplatu;

    }
}
