import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n Faktöriyel sayısını giriniz : ");
        // n! / (r! * (n - r)!) kombinasyonundaki n sayısını alıyoruz
        int n = scan.nextInt();
        int total = 1;
        int i = 1;
        while (i <= n) {
            total *= i;
            i++;
        }

        // n! / (r! * (n - r)!) kombinasyonundaki r sayısını alıyoruz
        System.out.print("r Faktöriyel sayısını giriniz : ");
        int r = scan.nextInt();
        int total1 = 1;
        int l = 1;
        while (l <= r) {
            total1 *= l;
            l++;
        }

        // n! / (r! * (n - r)!) kombinasyonundaki (n-r)! hesabını yapıp total2 ye atıyoruz
        int a = n - r;
        int total2 = 1;
        int k = 1;
        while (k <= a) {
            total2 *= k;
            k++;
        }
        int total3 = total1 * total2; // n! / (r! * (n - r)!) kombinasyonundaki (r! * (n - r)! kısmını total3 e atıyoruz
        int total4 = total / total3; // n! / (r! * (n - r)!) kombinasyonunu bitiriyoruz

        System.out.print("C(n,r) = " + total4);


    }
}