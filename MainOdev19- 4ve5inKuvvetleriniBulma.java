import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        for (int s = 1; s <= n; s *= 5) {
            System.out.println(s);
        }



    }
}