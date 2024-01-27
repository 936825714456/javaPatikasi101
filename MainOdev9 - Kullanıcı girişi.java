import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName = "patika" , password = "java123", newpassword;
        int select;



        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adı : ");
        userName = inp.nextLine();

        System.out.print("Şifre : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Yaptınız !");
        } else if (!userName.equals("patika") || !password.equals("java123")) {
            System.out.println("Kullanıcı adınız veya şifreniz hatalı !");
            System.out.println("Şifrenizi sıfırlamak istiyorsanız\n1 - Evet : \n2 - Hayır : ");
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz : ");
                    Scanner veri = new Scanner(System.in);
                    newpassword = veri.nextLine();
                    if (!newpassword.equals("java123")) {
                        System.out.println("Yeni şifre oluşturuldu.");
                        System.out.print("Lütfen yeni şifrenizle tekrar giriş yapınız.");
                    } else {
                        System.out.print("Şifre oluşturulamadı şifreniz eski şifrenizle aynı olamaz, lütfen tekrar deneyiniz ve başka şifre giriniz. ");
                    }
                    break;
                case 2:
                    System.out.print("Kullanıcı adı ve şifrenizle tekrar deneyiniz! ");
                    break;
            }

        } else {
            System.out.print("Kullanıcı adı veya şifreniz hatalı !!! ");
        }


    }
}