package infotechacademy;

import java.util.Scanner;

public class AdSoyadBirlestirme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = scanner.nextLine();

        // Ad ve soyadı birlestirip sonucu yazdırma
        String tamAd = ad + " " + soyad;
        System.out.println("Ad ve soyadınız: " + tamAd);

        scanner.close();

    }

}
