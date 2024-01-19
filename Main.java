import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya ,biyo, turkce, tarih, muzik, cografya;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Biyoloji notunuz: ");
        biyo = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Coğrafya notunuz: ");
        cografya = inp.nextInt();

        double toplam = ( mat + fizik + kimya + biyo + turkce + tarih + muzik + cografya);
        double sonuc = (toplam / 8);
        boolean sonuc1 = sonuc >= 60;
        String str = sonuc1 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.print("Not ortalaması " + sonuc + " Sınıfı geçme durumu : " +str);



    }
}