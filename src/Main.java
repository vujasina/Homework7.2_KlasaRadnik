public class Main {
    public static void main(String[] args) {

        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Aleksa", "Aleksic", "0101980710111", "11-12123123-65", 10.0);
            System.out.println(radnikPoSatu);
            radnikPoSatu.isplatiPlatu();

        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Branko", "Brankovic", "0202980710222", "11-12123123-66", 50.0);
            System.out.println(radnikPoDanu);
            radnikPoDanu.isplatiPlatu();

        RadnikFiksno radnikFiksno = new RadnikFiksno("Cvetko", "Cvetkovic", "0303980710333", "11-12123123-67", 1200.0);
            System.out.println(radnikFiksno);
            radnikFiksno.isplatiPlatu();

    }
}