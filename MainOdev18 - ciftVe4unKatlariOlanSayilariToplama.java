import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int toplam = 0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz : ");
            i = inp.nextInt();
            if(i % 2 == 0 && i % 4 == 0 && i > 0){
                toplam += i;

            }

        }while (i % 2 == 0 && i > 0);
            System.out.print("Çift ve 4'ün katları olan sayıların  toplamı : " + toplam);
    }
}