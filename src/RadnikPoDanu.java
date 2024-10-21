import java.util.Scanner;

public class RadnikPoDanu extends Radnik{

    //polja nema

    //konstruktori

    public RadnikPoDanu(){

    }

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plata) {

        super(ime, prezime, jmbg, ziroRacun, plata);

    }

    //metode

    Scanner scanner = new Scanner(System.in);

    public void isplatiPlatu() {
        System.out.println("Unesi broj radnih dana radnika " + (ime) + " " + (prezime) + " za ovaj mesec: ");
        double brojDana = scanner.nextDouble();
        double zaIsplatu = super.isplatiPlatu(plata, brojDana);
        System.out.println("Za isplatu radniku " + (ime) + " " + (prezime) + ": " + zaIsplatu);

    }

    @Override
    public String toString() {
        return "RadnikPoDanu{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg=" + jmbg +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}