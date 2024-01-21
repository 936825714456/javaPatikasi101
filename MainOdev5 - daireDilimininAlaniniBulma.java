import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        //Alan Formülü : π * r * r;

        int r , alfa;
        double pi = 3.14, alan ;


        Scanner veri = new Scanner(System.in);
        System.out.print("r'yi Giriniz : ");
        r = veri.nextInt();

        System.out.print("alfa'yı Giriniz : ");
        alfa = veri.nextInt();

        alan = (pi * (r * r) * alfa) / 360;

        System.out.print("Alanınız : " + alan);





    }
}