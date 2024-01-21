import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, alinanArmut, alinanElma,alinanDomates, alinanMuz, alinanPatlican, armutFiyati, elmaFiyati, domatesFiyati, muzFiyati, patlicanFiyati;
        armutKg = 2.14;
        elmaKg = 3.67;
        domatesKg = 1.11;
        muzKg = 0.95;
        patlicanKg = 5.00;


        Scanner veri = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        alinanArmut = veri.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        alinanElma = veri.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        alinanDomates = veri.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        alinanMuz = veri.nextDouble();

        System.out.print("Patlıcan kaç kilo ? :");
        alinanPatlican = veri.nextDouble();

        armutFiyati =alinanArmut * armutKg;
        elmaFiyati = alinanElma * elmaKg;
        domatesFiyati = alinanDomates * domatesKg;
        muzFiyati = alinanMuz * muzKg;
        patlicanFiyati = alinanPatlican * patlicanKg;

        System.out.println("Alınan armutun fiyatı : " + armutFiyati);
        System.out.println("Alınan elmanın fiyatı : " + elmaFiyati);
        System.out.println("Alınan domatesin fiyatı : " + domatesFiyati);
        System.out.println("Alınan muzun fiyatı : " + muzFiyati);
        System.out.println("Alınan patlıcanın fiyatı : " + patlicanFiyati);

        System.out.print("Toplam harcanan para : " + (armutFiyati + elmaFiyati + domatesFiyati + muzFiyati + patlicanFiyati) + " TL");



    }
}