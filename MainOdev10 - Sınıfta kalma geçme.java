import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

            System.out.print("Matematik notunuz : ");
            mat = input.nextInt();


        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (!isValidGrade(mat) || !isValidGrade(fizik) || !isValidGrade(turkce) || !isValidGrade(kimya) || !isValidGrade(muzik)) {
            System.out.println("Notlar 0 ile 100 arasında olmalıdır.");
            return;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik)/5;

        if (avarage <= 55){
            System.out.print("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");
        }else {
            System.out.print("Tebrikler sınıfı geçtiniz !");
        }

        System.out.print("Ortalamanız : " + avarage);


    }
    private static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }
}