import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        int km , acilis = 10;
        double kmFiyat = 2.20, toplam;

        Scanner veri = new Scanner(System.in);
        System.out.print("Gidilen mesafe - km : ");
        km = veri.nextInt();

        toplam = (km * kmFiyat) + acilis;


        toplam = (toplam<20) ? 20 : toplam;
        System.out.print("Toplam tutar : " + toplam);





    }
}