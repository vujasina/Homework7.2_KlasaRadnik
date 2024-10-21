import java.util.Scanner;

public class RadnikPoSatu extends Radnik{

    //polja

    private double cenaPoSatu;

    //konstruktori

    public RadnikPoSatu(){

    }

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double plata, double cenaPoSatu) {

        super(ime, prezime, jmbg, ziroRacun, plata);
        this.cenaPoSatu = cenaPoSatu;

    }

    //metode

    Scanner scanner = new Scanner(System.in);

    public double isplatiPlatu(RadnikPoSatu radnikPoSatu) {
        System.out.println("Unesi broj radnih sati radnika " + (ime) + " " + (prezime) + " za ovaj mesec: ");
        double brojSati = scanner.nextDouble();
        double plata = brojSati * cenaPoSatu;
        return plata;

    }

    // get i set



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
