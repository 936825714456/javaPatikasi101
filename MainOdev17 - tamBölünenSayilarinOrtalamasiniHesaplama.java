import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        i = input.nextInt();


        for (int j = 0; j < i; ) {
            j++;

            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        */

        /*
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        i = input.nextInt();
        double toplam = 0;
        int adet = 0;


        for (int j = 1; j <= i; j++){

            if (j % 3 == 0 && j % 4 == 0){
                toplam = toplam + j;
                adet++;
                System.out.println(j);
            }
        }
        double ortalama = toplam / adet;
        System.out.println(adet);
        System.out.print("0'dan " + i + "'ye kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        */


        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int i = input.nextInt();

        int j = 1;
        while (j <= i){
            j++;
            if (j % 2 ==0){
                System.out.println(j);
            }
        }

    }
}