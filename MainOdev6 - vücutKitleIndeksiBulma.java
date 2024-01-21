import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg, boy, indeks;

        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = veri.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = veri.nextDouble();

        indeks = kg / (boy * boy);

        System.out.print("Vücut kitle indeksiniz : " + indeks);
        

    }
}