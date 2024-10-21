public class Main {
    public static void main(String[] args) {

        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Aleksa", "Aleksic", "0101980710111", "11-12123123-65", 0, 10.0);
        double plata1 = radnikPoSatu.isplatiPlatu(radnikPoSatu);
        radnikPoSatu.setPlata(plata1);
        System.out.println(radnikPoSatu);


        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Branko", "Brankovic", "0202980710222", "11-12123123-66", 0, 50);
        double plata2 = radnikPoDanu.isplatiPlatu(radnikPoDanu);
        radnikPoDanu.setPlata(plata2);
        System.out.println(radnikPoDanu);


        RadnikFiksno radnikFiksno = new RadnikFiksno("Cvetko", "Cvetkovic", "0303980710333", "11-12123123-67", 1200.0);
            System.out.println(radnikFiksno);
    }
}