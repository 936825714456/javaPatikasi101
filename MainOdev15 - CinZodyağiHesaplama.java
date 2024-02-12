import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        int dogumyili = input.nextInt();

        if (dogumyili > 0) {
            if (dogumyili % 12 == 0) {
                burc = "Maymun";
            } else if (dogumyili % 12 == 1) {
                burc = "Horoz";
            } else if (dogumyili % 12 == 2) {
                burc = "Köpek";
            } else if (dogumyili % 12 == 3) {
                burc = "Domuz";
            } else if (dogumyili % 12 == 4) {
                burc = "Fare";
            } else if (dogumyili % 12 == 5) {
                burc = "Öküz";
            } else if (dogumyili % 12 == 6) {
                burc = "Kaplan";
            } else if (dogumyili % 12 == 7) {
                burc = "Tavşan";
            } else if (dogumyili % 12 == 8) {
                burc = "Ejderha";
            } else if (dogumyili % 12 == 9) {
                burc = "Yılan";
            } else if (dogumyili % 12 == 10) {
                burc = "At";
            } else if (dogumyili % 12 == 11) {
                burc = "Koyun";
            }
        } else isError = true;

        if (isError) {
            System.out.print("Hatalı giriş yaptınız, Lütfen tekrar deneyiniz !!!");
        } else {
            System.out.print("Çin Zoyağı Burcunuz : " + burc);
        }


    }
}