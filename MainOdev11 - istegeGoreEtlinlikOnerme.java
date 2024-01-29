import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String istek;
        String hava5DenDusuk = "Bugün kayak yapmak istiyorum" , hava5Le15Arasi = "Bugün sinemaya gitmek istiyorum" , hava15le25Arasi = "Bugün piknik yapmak istiyorum" , hava25DenYuksek = "Bugün yüzmeye gitmek istiyorum";
        int todayHeat = 25;

        Scanner input = new Scanner(System.in);
        System.out.print("Bugün ne yapmak istiyorsun? : ");
        istek = input.nextLine();

        if (todayHeat <= 5 && istek.equals(hava5DenDusuk)) {
        System.out.print("Bugün sıcaklık " + todayHeat + " derece. Bugün kayak yapabilirsin, hava sıcaklığı uygun :) ");
        }else if(todayHeat >= 5 && todayHeat <= 15 && istek.equals(hava5Le15Arasi)){
            System.out.print("Hava sıcaklığı " + todayHeat + " derece. Bugün sinemaya gidebilirsin :) ");
        }else if(todayHeat >= 15 && todayHeat <= 25 && istek.equals(hava15le25Arasi)){
            System.out.print("Hava sıcaklığı " + todayHeat + " derece. Bugün piknik yapabilirsin, hava sıcaklığı uygun :) ");
        }else if(todayHeat >= 25 && istek.equals(hava25DenYuksek)){
            System.out.print("Hava sıcaklığı " + todayHeat + " derece. Bugün yüzmeye gidebilirsin, hava sıcaklığı uygun :) ");
        }else{
            System.out.print("Hava sıcaklığı " + todayHeat + " derece. Hava sıcaklığı uygun değil malesef :( " );
        }

    }
}