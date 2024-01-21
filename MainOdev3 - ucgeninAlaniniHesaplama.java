import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        double u, alan;

        Scanner veri = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz : ");
        a = veri.nextInt();

        System.out.print("2. Kenarı giriniz :");
        b = veri.nextInt();

        System.out.print("3. Kenarı giriniz :");
        c = veri.nextInt();

        u = (a+b+c)/2;

        alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));
        System.out.print("Üçgenin alanı : " + alan);



    }
}