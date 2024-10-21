import java.util.Scanner;

public class RadnikFiksno extends Radnik{

    //polja nema

    //konstruktori

    public RadnikFiksno(){

    }

    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, double plata) {

        super(ime, prezime, jmbg, ziroRacun, plata);

    }

    //metode

    Scanner scanner = new Scanner(System.in);

    public void isplatiPlatu() {
        System.out.println("Unesi fiksnu platu radnika " + (ime) + " " + (prezime) + " za ovaj mesec: ");
        double fiksnaPlata = scanner.nextDouble();
        double zaIsplatu = fiksnaPlata;
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