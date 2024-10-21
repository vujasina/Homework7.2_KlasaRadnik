import java.util.Scanner;

public class RadnikPoSatu extends Radnik{

    //polja nema

    //konstruktori

    public RadnikPoSatu(){

    }

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plata) {

        super(ime, prezime, jmbg, ziroRacun, plata);

    }

    //metode

    Scanner scanner = new Scanner(System.in);

    public void isplatiPlatu() {
        System.out.println("Unesi broj radnih sati radnika " + (ime) + " " + (prezime) + " za ovaj mesec: ");
        double brojSati = scanner.nextDouble();
        double zaIsplatu = super.isplatiPlatu(plata, brojSati);
        System.out.println("Za isplatu radniku " + (ime) + " " + (prezime) + ": " + zaIsplatu);

    }

    @Override
    public String toString() {
        return "RadnikPoSatu{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg=" + jmbg +
                ", ziroRacun='" + ziroRacun + '\'' +
                ", plata=" + plata +
                '}';
    }
}
