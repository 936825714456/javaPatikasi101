import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafe (KM): ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double toplamFiyat = mesafe * 0.10; // Mesafe başına ücret 0,10 TL olarak belirlendi

            if (yas < 12) {
                toplamFiyat *= 0.5; // 12 yaşından küçükse %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // 12-24 yaş arasındaysa %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // 65 yaşından büyükse %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat = (toplamFiyat * 0.8) * 2; // Gidiş-Dönüş seçilmişse %20 indirim
            }

            System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
        }

        scanner.close();
    }
}