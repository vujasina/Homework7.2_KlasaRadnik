import java.util.Scanner;

public class RadnikPoDanu extends Radnik{

    //polja

    private double cenaPoDanu;

    //konstruktori

    public RadnikPoDanu(){

    }

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, double plata, double cenaPoDanu) {

        super(ime, prezime, jmbg, ziroRacun, plata);
        this.cenaPoDanu = cenaPoDanu;

    }

    //metode

    Scanner scanner = new Scanner(System.in);

    public double isplatiPlatu(RadnikPoDanu radnikPoDanu) {
        System.out.println("Unesi broj radnih dana radnika " + (ime) + " " + (prezime) + " za ovaj mesec: ");
        double brojDana = scanner.nextDouble();
        double plata = brojDana * cenaPoDanu;
        return plata;

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